import java.util.Scanner;
public class CWH_18_elseif {

    public static void main(Srings[] args) {
        System.out.print("Enter the value ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 18 :
                System.out.println("You are going to become an Adult");
                
                break;
            case 23:
                System.out.println("You are going to join job");
                break;
            case 60:
                 System.out.println("You are going to retire");
                 break;
        
            default:
            System.out.println("Enjoy you life");

                break;
               
        }
         System.out.println("Thank you for using my code!");
        /* 
        if (a>56) {
            System.out.println("you are experienced");

            
        }else if(a>46){
            System.out.println("you are semi experienced");
        }else if(a>26){
            System.out.println("you are semi semi experuenced");
        }else{
            System.out.println("you are junior");
        }*/
    }

}