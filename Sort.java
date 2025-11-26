import java.util.Scanner;

public class Sort {
     static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+ " ");

        }
        System.out.println();
    }
    static void swap(int [] arr,int i, int j ){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    static void sortArrayByParity(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while (left<right){
            if(arr[left]%2==1 && arr[right] % 2 ==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;

            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
static void  reverse(int [] arr){
    int i=0, j=arr.length-1;
    while(i<j){
        swap(arr, i, j);
        i++;
        j--;
    }
}
static int [] sortSquare(int [] arr){
    int  n =arr.length;
    int left = 0, right=n-1;
    int [] ans  = new int [n];
    int k=0;
   
}
    // static void sortZeroAndOnes(int [] arr){
    //     int n = arr.length;
    //     int left =0, right = n-1;
    //     while(left<right){
    //         if(arr[left]==1 && arr[right] ==0){
    //             swap(arr, left, right);
    //             left++;
    //             right--;
    //         }
    //         if(arr[left]==0){
    //             left++;
    //         }
    //         if(arr[right] ==1){
    //             right--;
                
    //         }

    //     }
    // }
    // static void sortZeroAndOne(int [] arr){
    //     int n = arr.length;
    //     int zeroes = 0;
        //count number of zeroes
        // for(int i=0; i<n;i++){
        //     if(arr[i] == 0){
        //         zeroes++;
        //     }

        
        // 0 to zeroes-1 : 0, zeroes-1: 0, zeroes to n-1: 1
    //     for(int i=0; i<n; i++){
    //         if(i<zeroes){
    //             arr[i] = 0;

    //         }else{
    //             arr[i] =1;
    //         }
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter "+ n +" elements" );
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Original array: ");
        printArray(arr);
        // sortZeroAndOnes(arr);
        sortArrayByParity(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}