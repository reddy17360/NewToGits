package JavaProg.ArrayPrograms;

public class PatternsArray {
   public static void main(String args[]) {
       PatternsArray.triAngle(4);
       PatternsArray.pyramid();
    }

    public static void square(int n){
       for(int i = 0 ; i<n ; i++){
           for(int j=0 ; j<n; j++) {
               System.out.print(" * ");
           }
           System.out.println();
       }

    }

    public static void triAngle(int n){
        for(int j=n ; j>=0; j--) {
        for(int i = 0 ; i<j ; i++){ //0< 4
          //0<=0 , 1<=0
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void pyramid(){
    int n = 5; // Number of rows
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}


