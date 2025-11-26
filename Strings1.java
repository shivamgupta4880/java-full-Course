import java.util.*;

public class Strings1 { // Fixed class name

    public static void main(String args[]) { // Fixed parameter type
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        sc.close(); // Good practice to close the scanner
    }
}
