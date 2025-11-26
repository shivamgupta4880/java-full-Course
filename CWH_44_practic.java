class Cylinder{
     private int radius;
     private int height;
     public int getRaidus(){
          return radius;

     }
     public void  setRadius(int radius){
          this.radius =radius;

     }public int getHeight(){
          return height;
     }
     public void setHeight(int height){
          this.height = height;
     }
     public double surfaceArea(int radius, int height){
          return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
}public double volume(){
     return Math.PI*radius*radius*height;

}}

public class CWH_44_practic {
     public static void main(Srings[] args) {
          //problem1;
          Cylinder c = new Cylinder();
          c.setHeight(12);
           c.getHeight();
          System.out.println(c.getHeight());
          c.setRadius(9);
          System.out.println(c.getRaidus());
          //problem2
          System.out.println(c.surfaceArea(9, 12));
          System.out.println(c.volume());
     }
    

}
