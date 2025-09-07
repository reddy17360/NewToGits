package JavaProg.PatternBased;

public class RightAngleTriangle {
    public static void main(String[] sanju) {
int n=5;
       // char x='a';
         for(int i=1; i<=5;i++){

             for(int j=1; j<=i ;j++){
                 System.out.print(j);
             }

             System.out.println(" ");
         }
        for(int i=n; i>=1;i--){
            for(int j=1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
