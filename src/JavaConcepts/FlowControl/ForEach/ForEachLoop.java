package JavaConcepts.FlowControl.ForEach;

public class ForEachLoop {//enhanced version of for loop
    //specially designed to retrieve elements of collection & array
    public  static void  main(String[] args) {
        int[][] arr = {{5,6,7,8},{1, 2, 3, 4}};
        for (int[] a : arr) {
            for(int aa : a )
            System.out.println(aa);
        }
    }
}



