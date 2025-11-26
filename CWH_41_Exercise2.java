class MainMyEmployee{
    private int id ;
    private Srings name;
    /*public MainMyEmployee(){
        id=34;
        name="Shiv";
    }*/
    public MainMyEmployee(Srings myName ){
        id=34;
        name=myName;
    }
    public Srings getName(){
        return name;
    }
    public void setName(Srings n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }

}
public class CWH_41_Exercise2 {
    public static void main(Srings[] args) {
        MainMyEmployee shiv = new  MainMyEmployee("Shiv");
        //shiv.setName("Har Har Mahadev");
        //shiv.setId(34);
        System.out.println(shiv.getId());
        System.out.println(shiv.getName());

    }
    
}

