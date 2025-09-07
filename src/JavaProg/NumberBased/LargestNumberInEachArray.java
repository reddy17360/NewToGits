package JavaProg.NumberBased;

public class LargestNumberInEachArray {
    public static void main(String[] sanju){
       int[][] mulArray = {{1,2,3},{4,5,6}};
       getTheMax(mulArray);
    }
    static void getTheMax(int[][] mulArray){
        int max=0;
        int[] maxfromall =new  int[mulArray.length];
        for(int i=0;i<mulArray.length;i++){

            for(int j=0 ; j<mulArray[i].length ; j++){
                max=mulArray[i][j];
                if(mulArray[i][j] > max){
                    max=mulArray[i][j];
                }
              //  maxfromall[i][j] = max;
            }


        }
        System.out.println(max);
    }
}
