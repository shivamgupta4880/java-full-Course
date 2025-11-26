/*class Base{
    int x;
    public int getx(){
        return x;
    }public void setx(int x){
        System.out.println("I am setting x now");
        this.x=x;

    }

   public void printMe(){
    System.out.println("I am a constructor");

   }

}class Derived extends Base{
    int y;
    public int gety(){
        return y;
    }public void sety(int y){
        this.y=y;
    }   
}
public class CWH_44_inheritance {

    public static void main(String[] args) {
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());
        Derived d = new Derived();
        d.sety(43);
        System.out.println(d.gety());


        
    }
}*//* 
class Animal{
    int x;
    public int getx(){
        return x;

    }public void setx(){
        System.out.println("bhoo bhoo..");
        this.x=x;

    }

}class Derived extends Animal{
    int y;
    public int gety(){
        return y;
    }public void sety(){
        System.out.println("Meow meow..");
        this.y=y;
    }
}
public class CWH_44_inheritance{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setx();
        System.out.println(a.getx());
        Derived d = new Derived();
        d.sety();
        System.out.println(d.gety());
    }
}*/
class animal1 {
    public void walking() {
        System.out.println("Animal can walk");
    }

    public void eat() {
        System.out.println("Animal can eat");
    }

}
class Dog1 extends animal1 {
    public void bark() {
        System.out.println("Dog can bark");
    }
}


public class CWH_44_inheritance{
    public static void main(Srings[] args) {
    animal1 m = new animal1();
    m.walking();
    m.eat();
//    m.bark();   will throw an error because m.eat() is not present in class animal
     Dog1 d = new Dog1();
     d.bark();
     d.walking();
     d.eat();
    }
}