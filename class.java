public class class  {
    int x=100, y=100;//instance variable
	
void add(int x,int y)
{
	System.out.println(x+y);
	System.out.println(this.x+this.y);
}
public static void main(String[] args)
{
Education E=new Education();
E.add(5, 6);
}

}