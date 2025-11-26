import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a str");
        String str =sc.nextLine();
        StringBuilder reverserd = new StringBuilder(str).reverse();
        System.out.println(reverserd);
    }
}
