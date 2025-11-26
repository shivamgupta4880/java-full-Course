class EkCLass{
    int a;
    public int geta(){

         return a;
    }
    EkCLass(int v){
      this.a=v;
        System.out.println("I am a constructor");

    }
    public int returname(){
        return 1;
    }
}
class DoClass extends EkCLass{
    DoClass(int c){
        super(c);
        System.out.println("Mai ek aur constructor hoon");

    }
}
public class Cwh_47_this_supar {
    public static void main(Srings[] args) {
        EkCLass e = new EkCLass(65);
        DoClass d= new DoClass(9);
        System.out.println(e.geta());
        System.out.println(d.geta());

    }
    
}
