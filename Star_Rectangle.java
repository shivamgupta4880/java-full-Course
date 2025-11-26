import java.util.Scanner;

public class Star_Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
