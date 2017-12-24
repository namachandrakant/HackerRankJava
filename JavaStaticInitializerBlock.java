import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {

static int B,H;
static boolean flag=false;
static{
    try{
        Scanner sc=new Scanner(System.in);        
        B = sc.nextInt();
        H = sc.nextInt();
        if(B>0 && H>0) 
            flag=true;
        else 
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
