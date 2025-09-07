package JavaProg.PatternBased;

public class InvertedPyramid {
    public static void main(String[] sanju) {
        //ulta pyramid
        //**********
        // ********
        //  *****
        //   ***
        //    *
        int n = 5;
        for (int i = n; i >= 1; i--) { //loop for number of rows
            for (int j = 1; j <=n-i; j++) {
                //loop for spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
