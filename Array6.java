import java.util.Scanner;

public class Array6 {
    //Taking Array input in java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int []arr = new int [5];

    System.out.println("Enter array "+ n +"elements");
    for(int i = 0; i<arr.length; i++){ 
        arr[i]=sc.nextInt();

    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }

    }

    
}
