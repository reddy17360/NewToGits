package JavaProg2.ArrayPat;

public class Pyramids {

    public static void main(String[] args) {

        //  squarePyramid();
        /// reverseTriagnle();
        // trianglePyramid();
        pyramid();
        ultaPyramid();//


    }

    static void squarePyramid() {
        System.out.println(" Square pyramid");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(" * ");
            System.out.println();
        }
    }


    static void trianglePyramid() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    static void reverseTriagnle() {
        int rows = 4;
        for (int i = 0; i <= rows; i++) { //4

            for (int j = 0; j <= rows - 1; j++) {
                System.out.print(" ");
            }

            for (int k = i; k < 2 * i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void pyramid() {
        int n = 4;
        for (int i = 0; i < n; i++) {//outer loop to handle no of rows

            for (int j = n - i; j >= 0; j--) {//inner loop to handle columns
                //to print spaces
                System.out.print(" ");
            }

            System.out.println("This is from dev-X i.e sanju from banglore");
            System.out.println("This is from dev-X i.e sanju from banglore");
            System.out.println("This is from dev-X i.e sanju from banglore");
            System.out.println("This is from dev-X i.e sanju from banglore");
            System.out.println("This is from dev-X i.e sanju from banglore");
            System.out.println("This is from dev-X i.e sanju from banglore");
            System.out.println("This is sannju");



            System.out.println("dududududmmmm");


            for (int k = 0; k <= i; k++)
                System.out.print("* ");

            System.out.println("");


        }
    }

    static void ultaPyramid() {
        int nn = 10;
        while (nn > 0) {
            int n = 4;
            for (int i = 0; i <= n; i++) {

                for (int j = 0; j <= i; j++)
                    System.out.print(" ");

                for (int j = 0; j <= n - i; j++)
                    System.out.print("* ");
                System.out.println();
            }

            int ns = 4;
            for (int i = 0; i < ns; i++) {//outer loop to handle no of rows

                for (int j = ns - i; j >= 0; j--)//inner loop to handle columns//to print spaces
                    System.out.print(" ");

                for (int k = 0; k <= i; k++)
                    System.out.print("* ");

                System.out.println("");
            }
            nn--;

        }
    }
}


