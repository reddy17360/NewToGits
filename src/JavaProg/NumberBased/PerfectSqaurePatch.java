package JavaProg.NumberBased;

public class PerfectSqaurePatch {
    public static void main(String[] square){
    squarePatch(4);
    }
    static void squarePatch(int squareNum){

        for(int i=1;i<=squareNum;i++){

            for(int j=1;j<=squareNum;j++){

                System.out.print( squareNum+" ");
            }
            System.out.println();
        }
        System.out.print("]\r");
    }

}
