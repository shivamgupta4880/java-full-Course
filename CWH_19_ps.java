import java.util.Scanner;
public class CWH_19_ps {
    public static void main(Srings[] args) {
        //byte m1,m2,m3;
       // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the mark biology");
        //m1=sc.nextByte();
        //System.out.println("Enter the value Mathematics");
       // m2=sc.nextByte();
        //System.out.println("Enter the value of Chemistry");
        //m3=sc.nextByte();
      /*   float avg=(m1+m2+m3)/3.0f;
       // System.out.println("your overall percentage of "+ avg);
       // if(avg>=40 && m1 >= 33 && m2 >=33 && m3 >=33){
            System.out.println("Eligible for Admission");

        }

        if(avg >= 80 && m1 >= 80 && m2>=80 && m3>=80){
            System.out.println("Outstading");

        }else{
            System.out.println("Not Eligible for Admission");
        }

 Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your income ");
    float tax=0;

    float income=sc.nextFloat();;
        if(income<=2.5){
            tax = tax+0;

        }
        else if(income>2.5f && income<=5.0f){
            tax = tax+0.5f *(income-2.5f);

        }else if(income>5.0f && income <=10.0f){
            tax = tax+0.5f *(5.0f -2.5f);
            tax = tax+0.2f *(income-5f);

        }else if(income>10.0f){
            tax = tax+0.5f *(5.0f -2.5f);
            tax = tax+0.2f *(10.0f -5.0f);
            tax = tax+0.3f *(income-10.0f);
            


        }
        System.out.println("the total tax paid by the  employee "+tax);
     //day    
        Scanner sc= new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
            System.out.println("monday");
            case 2:
            System.out.println("tuesday");
            case 3:
            System.out.println("wednesday");
            case 4:
            System.out.println("thursday");
            case 5:
            System.out.println("friday");
            case 6:
            System.out.println("saturday");
            case 7:
            System.out.println("sunday");

// Leap year
System.out.println("Enter the year to be checked");
        Scanner s=new Scanner(System.in);
        int year= s.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("Given year is Leap Year");
        }
        else
        {
            System.out.println("Given year is not Leap Year");
        }*/
        Scanner sc=new Scanner(System.in);
        Srings n=sc.next();
        if(n.endsWith(".org")){
            System.out.println("it is a company");
        }else if(n.endsWith(".com")){
            System.out.println("it is a website");
        }else if(n.endsWith(".in")){
            System.out.println("it is a india");
        }



    }
}

