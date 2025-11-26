 class demoArrayss {
    void multiArrays(){
        int [] [] arr_1 =new int[5][3];
        int [][] arr ={{56,43,6}, {34, 7, 8}, {12, 56, 8}};
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][ 2]);


    }
    void demoArrays(){
        float [] weights=new float[3];
        String [] names= new String[5];
        int [] ages= new int [3];
        ages[0]=34;
        ages[1]=12;
        ages[2]=45;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        for(int i=0; i<3;i++){
            System.out.println(ages[i]);
        }
 
    }
    public class demoArray {
        public static void main(String[] args) {
            
            demoArrayss obj= new demoArrayss();
            obj.demoArrays();
            obj.multiArrays(); 
        }

    }
    
}
