/*class Employee{
    int id;
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
     public String getName(){
        return name;
    }
        public void setName(String n){
            name =n;
        }
    }
public class CWH_39_practice_Set_oop {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("john");
        emp.salary=34;
        System.out.println(emp.getSalary());
        System.out.println(emp.getName());
    }
}
*//* 
class sellphone{
    public void ringing(){
        System.out.println("Ringing...");

    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void calling(){
        System.out.println("Calling...");
    }
}public class CWH_39_practice_Set_oop {
    public static void main(String[] args) {
        sellphone realme = new sellphone();
        realme.ringing();
        realme.vibrating();
        realme.calling();
    }
}*/
//problem 3
/*class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}public class CWH_39_practice_Set_oop {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}*//* 
//problem 4 CReate a class rectangle  8 repeat 3
class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class CWH_39_practice_Set_oop {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.length=5;
        r.breadth=3;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}*//* 
//problem 5
class TommyVecetti{
    public void  hit(){
        System.out.println("Tommy is hitting");
    }
    public void kick(){
        System.out.println("Tommy is kicking");
    }
    public void run(){
        System.out.println("Tommy is running");
    }
}
public class CWH_39_practice_Set_oop {
    public static void main(String[] args) {
        TommyVecetti tommy = new TommyVecetti();
        tommy.hit();
        tommy.kick();
        tommy.run();
    }
}*/