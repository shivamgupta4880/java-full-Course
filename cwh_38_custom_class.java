import java.text.AttributedCharacterIterator.Attribute;

class Employee{
    int id; // Attribute
    Srings name;// 
    int salary;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
        public int getSalary(){
            return salary;
        
    }
    
} 
public class cwh_38_custom_class {
    public static void main(Srings[] args) {
        System.out.println("This is our custom class");
        Employee Shivam= new Employee();
        Employee john =new Employee();
        Shivam.id=12;
        Shivam.salary=34;
        Shivam.name="Shivam hii";

        john.id=13;
        john.name="John";
        john.salary=30;

        john.printDetails();
        Shivam.printDetails();
       // System.out.println(Shivam.id);
        //System.out.println(Shivam.name);
    }
    
}
