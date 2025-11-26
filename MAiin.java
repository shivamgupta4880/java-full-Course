public class MAiin {
 static void swap(int a, int b){
    System.out.println("Orginal");
    System.out.println("A: "+a);
    System.out.println("B: "+ b);
     int temp =a;

    a=b;
    b=temp;

    System.out.println("after");

    System.out.println("A: "+a);
    System.out.println("B: "+b);
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static int [] reverseArray(int[] arr){
        int n = arr.length;
        int [] ans= new int [n];
        int j=0;

        for(int i= n-1; i>=0; i--){ 
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        int [] arr= {1,2,3,4,5};
        int [] ans = reverseArray(arr);
        // swap(a, b);
printArray(ans);
    }
}

