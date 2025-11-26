public class CWH_31__methods {
    static int logic(int x,int y){
        int z ;

        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(Srings[] args) {
        int a=5;
        int b =7;
        int c;
        //Method invacation using Object creation
        
        //CWH_31__methods obj =new CWH_31__methods();
       // c=obj.logic(a, b);
       c=logic(a, b);
        int a1=9;
        int b1=7;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
