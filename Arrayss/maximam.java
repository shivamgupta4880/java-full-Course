package Arrayss;

import java.util.Scanner;

public class maximam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int x =  Integer.MIN_VALUE;
        System.out.println("Enter size of arr: ");
        int n= sc.nextInt();
         System.out.println("Enter arr elements: ");

        for(int i=0; i<n;i++){
                       int a =sc.nextInt();

            if(a>x) {
                x=a;

            }
            

        }
System.out.println("Maximum element in the array: " + x);
        
        }
}