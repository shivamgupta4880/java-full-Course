public class cwh_28_practics_set {
    public static void main(Srings[] args) {
       // practics problem1
      /* float [] marks={45.3f,23.3f,90.2f,93.3f,93.1f};
       float sum=0;
       for(float element:marks){
        sum=sum+element;
        

       }
       System.out.println(sum);*/
       //practics problem2
       /*float [] marks={45.3f,23.3f,90.2f,93.3f,93.1f};
       float num=45.7f;
       boolean isInArray=false;
       for(float element:marks){
       if(element==num){
        isInArray=true;
        break;
       }
    }
    if (isInArray) {
        System.out.println("The value is present in the array");
        
    }
    else{
        System.out.println("The value is not present in the array");
    }
    */
    //practics problem3
   /*  float [] marks={45.3f,23.3f,90.2f,93.3f,93.1f};
       float sum=0;
       for(float element:marks){
        sum=sum+element;
       }
       System.out.println("Sum of all elements in the array is: "+sum/marks.length);
    */
    //practics problem4
   /*  int [] [] mat1 = {{1, 2, 3},
                      {4, 5, 6}};



    int [] [] mat2 = {{9, 2, 4},
                      {4, 8, 6}};
    int [] [] result = {{0, 0, 0},
                        {0, 0, 0}};
    for(int i=0; i<mat1.length; i++)//row number of time
    {
        for(int j=0; j<mat1[i].length; j++){//column number of time
            System.out.format("Setting value for i=%d and j=%d\n", i, j);
            result[i][j]=mat1[i][j]+mat2[i][j];


        }
    }
    for(int i=0; i<mat1.length; i++){
        for(int j=0; j<mat1[i].length;j++){
            System.out.print(result[i][j]+" ");
            result[i][j]=mat1[i][j] + mat2[i][j];
        }
    }
        System.out.println("");
    }*/
    /*practics problem5
    int []arr ={1,2,3,4,5,6};
    int l = arr.length;
       int n= Math.floorDiv (l,2);
       int temp;
       for(int i=0; i<n;i++){
        temp =arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;
       }
       for(int element:arr){

   System.out.println(element + " ");

    }
    
} }
*/
//practics problem6
/*int [] arr ={1,21,3,455,5,34,67};
int max =0;
for(int e: arr){
    if(e>max){
        max=e;

    }
}
System.out.println("The value of the element in this arr is: "+ max);
System.out.println(Float.MAX_VALUE);
System.out.println(Float.MIN_VALUE);*/
//practics problem 7
/*int [] arr = {2,21,3,4,57,6,78};
int min=0;
for(int e:arr){
    if (e<min) {
        min =e;
    }
}
System.out.println("The value of the element in this arr is: "+ min);
        
    */
    int [] arr ={1,2,3,4,76,98};
    boolean isSorted =true;
    for (int i=0; i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            isSorted = false;
            break;

        }
    }
    if(isSorted){
        System.out.println("The array is sorted");
    }else{
        System.out.println("The array is not sorted");
    }
    }
}
