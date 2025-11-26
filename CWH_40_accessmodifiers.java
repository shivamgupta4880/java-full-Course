class MyEmployee{
    private int id;
    private Srings name;
    private int salary;
    public Srings getName(){
        return name;
    }

    public void setName(Srings n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}
public class CWH_40_accessmodifiers {
    public static void main(Srings[] args) {
        MyEmployee shiv=new MyEmployee();
        shiv.setName("Shiv hii");
        System.out.println(shiv.getName());
    }
    
}
