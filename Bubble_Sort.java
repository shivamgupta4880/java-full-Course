import java.util.*;
public class Bubble_Sort {
    public static void printArray(int arr[] ){
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    
    }
    

public static void main(String args[]) {
        int  arr[] ={7,6,3,1,2};
        //time comlexity =O(n^2)
       //Bubble_Sort
       for(int i=0;i<arr.length-1;i++){//n-1
        for(int j=0; j<arr.length-i-1;j++){//n
            if(arr[j]>arr[j+1])
            {
                //swap
                int temp=arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
        }

       }
       printArray(arr);
    }
}

