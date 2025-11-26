public class swap {
    static void  swapWithoutswap(int a, int b){
      System.out.println("Original values before swap");
      System.out.println("a: "+a);
      System.out.println("b: "+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("value after the swap");
      System.out.println("a: "+ a);
      System.out.println("b: "+b);
        }
        
    
    public static void main(String[] args) {
      int [] arr={1, 2,3 ,4,5 };
      int   a= 9;
      int b=3;
   swapWithoutswap(a, b);

    }
    
}
