package JavaProg.PatternBased;

public class DiamondShape {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){//for number of rows
            for(int j=1 ; j<=n-i ; j ++ ){
                System.out.print(" "); // number of spaces
            }
            for(int k=1 ; k<=2*i-1 ; k++)//number of stars
                System.out.print("*");
            System.out.println();
        }

        for(int j=n ; j>=1 ; j -- ){//for number of rows
            for(int i=1 ; i<=n-j ; i++){
                System.out.print(" "); // number of spaces
            }
            for(int k=1 ; k<=2*j-1 ; k++)//number of stars
                System.out.print("*");
            System.out.println();
        }

    }
}
