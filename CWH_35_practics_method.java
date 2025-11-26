public class CWH_35_practics_method {
   /*tatic void multiplication(int n){
        for(int i=1; i<=10;i++){
            System.out.format("%d X %d = %d \n",n, i,n*i);
        }
    }
    public static void main(String[] args) {
        multiplication(23);*/

   //}
   /*static void pattern(int n){
    for(int i=1; i<=n;i++)
    {
        for(int j=1; j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();

    }
}
    public static void main(String[] args) {
        pattern(6);
    
   }
*///problem3 
/*static int sumRect(int n){
   if (n==1){
    return 1;

   }
   return n+sumRect(n-1);

}
public static void main(String[] args) {
    System.out.println(sumRect(5));
}*/
//problem4
/* 
    static void pattern(int n){
        for (int i = 0; i<n ; i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);*/
   // problem 5
   /*static int fib(int n){
    if(n==1){
        return 0;

    }
    else if(n==2){
        return 1;
    }
    else{
        return fib(n-1)+fib(n-2);
    }
   }
   public static void main(String[] args) {
    
   
   int result =fib(5);
    System.out.println(result);
   }*/
  //problem 8
  static void pattern1_rec(int n){
    pattern1_rec(n-1);
    if(n>0){
        
        for(int i=0;i<n;i++){
            System.out.print("*");
        
    }
    System.out.println();
} 
}
public static void main(Srings[] args) {
    pattern1_rec(5);
  }
}
