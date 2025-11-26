import java.util.Scanner;

public class prefix1 {
    static int [] makePrefixSumArray(int[] arr){
        int n =arr.length;
        int [] pref =new int [n];
        pref[0] =arr[0];
        for(int i=0; i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;

    }
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size ");
        int n= sc.nextInt();
        int [] arr =new int [n];
        System.out.println("Enter "+ n +"elements");

        int[] pref = makePrefixSumArray(arr);
        printArray(pref);
        
    }
    
}
