import java.io.*;
import java.util.*;

public class JavaEndoffile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(i+" "+line);
            i++;
        }
    }
}
