public class CWH_32_Method_Over {
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" Bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning "+a+" Bro!");
        System.out.println("Good Morning "+b+" Bro!");
    }

    static void change(int x){
            x=98;
        }
        static void change2(int [] arr){
            arr[0]=98;
        }

     
        static void tellJoke(){
            System.out.println("I invented a new word!");
            System.out.println("Plagiarism!");
        }
        public static void main(Srings[] args) {
            
        //tellJoke();
        
       //int [] marks ={52,73, 77, 89, 98, 94} ;
        //Case1: Chaning te Integer

       //int x=45;
       //change(x);
       //System.out.println("The value of x after running change is: "+x);
       //int [] marks ={52,73, 77, 89, 98, 94} ;
       //change2(marks);
       //System.out.println("The value of x after running change is: "+marks[ 0 ]);
            foo();
            foo(3000);
            foo(3000,4000);
            // Argument are actual

    }
}