import java.util.Scanner;
import java.math.*;

public class BuiltIn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hte numbers : ");
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("MAX :"+ Math.max(Math.max(Math.max(a,b) ,c),d));
         System.out.println("MIN:"+ Math.min(Math.min(Math.min(a,b) ,c),d));
System.out.println(Math.pow(3,2));
    }
}