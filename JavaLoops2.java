import java.util.*;
import java.io.*;

class JavaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int v=0;
        if(t>=0 && t<=500){
         for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if(n>=1 && n<=15 && a>=0 && a<=50 && b>=0 && b<=50){
                v=a;
               for(int j=0;j<n;j++){
                    v+=Math.pow(2,j)*b;
                    System.out.print(v+" ");
             }
             System.out.println();
            }
         }
        }
        in.close();
    }
}
