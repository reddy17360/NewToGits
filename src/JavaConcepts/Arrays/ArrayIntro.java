package JavaConcepts.Arrays;

public class ArrayIntro {

    public   static void  main(String[] args) {
        int[][] a = new int[2][];
        a[0] = new int[2];
        a[1]=new int[1];
        //int[] aa = new int[-1];
        for(int i=0; i < a.length ; i ++ ){
            for(int j= 0;j < a[i].length ; j++){

            }
        }
        for(int i=0; i < a.length ; i ++ ){
            for(int j= 0;j < a[i].length ; j++){
                System.out.println(a[i][j]);
            }

            //in xle dimensions array lenth will return the base size array
            int[][] x = new int[2][4];
            System.out.println(x[0].length);
        }


      //  System.out.println(a[1].length);

        // declaration , creation & intialization in a single line

        int[][] arrs = {{10,20,20 ,40} , {11,22,33,44}} ;//short cut [2][4]

      //  System.out.println(arrs[1].length);


    }

}
