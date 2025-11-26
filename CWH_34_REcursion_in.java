public class CWH_34_REcursion_in {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(Srings[] args) {
        int x=4;
        System.out.println("The factorial of 0 is: "+factorial(x));
    }
}
