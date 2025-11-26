import java.util.Scanner;
public class cwh_11_ex1_sol {

    public static void main(Srings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject marks" );
        int marks1 = sc.nextInt();
        System.out.println("Enter second subject marks" );
        int marks2 = sc.nextInt();
        System.out.println("Enter third subject marks" );
        int marks3 = sc.nextInt();
        int  total = marks1 + marks2 + marks3 ;

        float percentage=((total)/300.0f)*100;
        System.out.println("percentage" );
        System.out.println(percentage);
    }
}