import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
      /*   Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] number=new int[rows][cols];
        //inpu
        //rowt
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();

        }

    }
}
*//*Take a matrix as input from the user . Serach for an
given  number x and print the indices at which it occurs.*/
Scanner sc = new Scanner(System.in);
int rows=sc.nextInt();
int cols=sc.nextInt();
int [] [] number=new int[rows] [cols];
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        number[i][j]=sc.nextInt();

    }


}
int x=sc.nextInt();
for(int i=0;i<rows; i++){
    for(int j=0;j<cols;j++){
        if(number[i][j]==x){
            System.out.println( "x is founsd at ("+i+","+j+")");
        }
    }
}
    }

}