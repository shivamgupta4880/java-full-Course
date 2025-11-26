public class cwh_28_multi_dm_arrays {
    public static void main(Srings[] args) {
        // Declare and initialize a 2D array
        int[][] flats ;
        flats = new int[2][3] ;
        flats[0][0] = 101;
        flats[0][1] = 102 ;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202 ;
        flats[1][2] = 203 ;
        //displaying the 2-D Array(For loop)
        System.out.println("2-D Array using for loop");
        for(int i=0; i<flats.length;i++){
            for(int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j] + " ");


        }
        System.out.println("\n");
    }
    
}
}