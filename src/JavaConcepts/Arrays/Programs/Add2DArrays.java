package JavaConcepts.Arrays.Programs;

public class Add2DArrays {
    public static void main(String args[]){
        int[][] a = {{1,2,3,4},{1,2,3,4}};
        int[][] b = {{1,2,3,4},{1,2,3,4}};

        int[][] c = new int[2][4];

        for(int i=0 ; i < a.length ; i++){
            for(int j=0; j<a[i].length ; j++){
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        System.out.println(a.length);
        for(int i=0 ; i < c.length ; i++){
            for(int j=0; j<c[i].length ; j++){
                System.out.print( c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
