package Arrayss;

import java.util.Scanner;

public class prod_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of arr");
         int n= sc.nextInt();
         long prod=1;

         for(int i=0; i<n;i++){
                prod*=sc.nextLong();
         }
         System.out.println(prod);

    }
}
