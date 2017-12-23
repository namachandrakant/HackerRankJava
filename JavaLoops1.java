import java.io.*;
import java.util.*;

public class JavaLoops1 {

    public static void main(String[] args) {       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n>=2&&n<=20){
            for(int i=1;i<11;i++){
                System.out.println(n+" x "+i+" = "+(n*i));
            }
        }
    }
}
