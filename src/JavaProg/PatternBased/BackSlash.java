package JavaProg.PatternBased;

public class BackSlash{
    public static void main(String[] args){
        //backslash
        int n=5;
        for(int i=n;i>=1;i--){//loop for number of rows
            for(int j=1;j<=i ;j++)//for number of  stars
                {
                    System.out.print(" ");
                }
            System.out.println("*");
        }

    }
}