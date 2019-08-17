package exponentpower1;
import java.util.Scanner;
import java.io.*;
public class Exponentpower1 {
    public static void main(String[] args) {
        int b,e,result=1;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the base number:");
        b=in.nextInt();
        System.out.println("enter the exponent number:");
        e=in.nextInt();
        while(e!=0)
        {
            result=result*b;
            e--;
        }
        System.out.println(result);
    }
    
}
