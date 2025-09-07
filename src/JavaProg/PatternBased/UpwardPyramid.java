package JavaProg.PatternBased;

public class UpwardPyramid {
    public static void main(String[] args){

//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
        int n=5 ; //number of rows
        for(int i=1; i<=n ; i++){//loop for number of rows
            for(int j=1;j<=n-i ;j++){
                //loop for spaces
                System.out.print(" ");
            }
            char ch='A';
            int num=1;
            for(int k=1 ; k <=(2*i-1) ; k++ )//loop for starts to print
            {
                System.out.print(num);
                num++;
            }
            System.out.println();

        }

    }
}
