// public class calculate {
//     public static void main(String[] args) {
        
    
//     int arr []={1,2,3};
//     int sum =0;
//     for(int i=0; i<arr.length;i++){
//         sum = sum+arr[i];
//     }
//     System.out.println(sum);

// }
// }
//calculate the  maxiux value out all the elements in the array
// public class calculate {

//     public static void main(String[] args) {
        
    
//         int arr[]={10,2,3,4,5,1};
//         int ans=0;
//         for(int i=0; i<arr.length;i++){
//             if(arr[i]>ans){
//                 ans=arr[i];
//             }  
//               }
//               System.out.println("MAx " +ans);
//     }
// }
public class calculate {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1};
        int x=1;
        int ans=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;

            }
        }
        System.out.println("found "+ x + " at index "+ ans);

    }
}