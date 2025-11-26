import java.util.Scanner;

public class Alaphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            char ch;
            if(i%2!=0){
                
                ch=(char) ('a' + i - 1);
            }
            else{
                 ch=(char) ('A' + i - 1);


            }
            for(int j=1; j<=n; j++){
                System.out.print(ch);
            }
            System.out.println();
            
        }
    }
}
