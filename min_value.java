import java.util.Scanner;

public class min_value {
    public static int findmax(int [] arr) {
        int max= Integer.MIN_VALUE;
        for(int i=0; i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max; 

        } 
           public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        System.out.println("Enter array size");
        int n = cs.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter " +n+" elements");
        for(int i=0; i<n; i++){
            arr[i]= cs.nextInt();
            System.out.println(Integer.MIN_VALUE);
            System.out.println("Second  Maximum Element: ");
        }

    }
}
