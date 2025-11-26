import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        //int[] marks={97,98,99};
        //Input 
        int number[]=new int [size];
        for (int i=0; i<size; i++){
            number[i]=sc.nextInt();
        }
        //Ouput
        for(int i=0; i<size; i++){

//marks[0]=10;
        //marks[1]=98;
        //marks[2]=98;
       // System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
            System.out.println(number[i]);
        }
    }
    
}
