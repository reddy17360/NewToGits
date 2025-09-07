package JavaProg.PatternBased;

public class HallowPyramid {
    // output should be
    // 1 2 3 4 *
    // 1 2 3 *   *
    // 1 2 *       *
    // 1 * * * * * * *
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)//no of rows
        {
            for(int j=1 ; j <=n-i ; j++ )//number of spaces
            {
                System.out.print(" ");
            }
            //number of starts and spaces
            for(int k=1 ; k <= 2 * i -1 ; k ++ ){
                if(k ==1  || k==2 * i -1 )
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n; i>=1; i--)//no of rows
        {
            for(int j=1 ; j <=n-i ; j++ )//number of spaces
            {
                System.out.print(" ");
            }
            //number of starts and spaces
            for(int k=1 ; k <= 2 * i -1 ; k ++ ){
                if(k ==1  || k==2 * i -1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}
