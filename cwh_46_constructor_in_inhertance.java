
class Base1{
    Base1(int a){
        System.out.println("I am an oerloaded constructor with value of a as:"+a);
    }
    

}
class Derived1 extends Base1{
    Derived1(){
       // super(a0);
        System.out.println("I am a derived class constructor");
    }Derived1(int x , int y){

    }
    
}
public class cwh_46_constructor_in_inhertance {
    public static void main(Srings[] args) {
        //Base1 b= new Base1();
        Derived1 d = new Derived1();
    }
    
}
//
