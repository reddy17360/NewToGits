package JavaConcepts.Arrays.Programs;

public class ArrayElementAssignments {

    public static void main(String[] args){

        Object[] obj = new Object[10];
        obj[0] = new Object();
        obj[1] = new String("durga");


        Runnable[] runnable  = new Runnable[10];
        runnable[0] = new Thread();

        int[] x = new int[10];
        char c = 'a';
      x[0] = c ;

      //whenever we are assiging one array to another array elements won't be copied just ref var is re-assigned
        int[] y = {10,20,30,40};
        int[] z = {50, 60};
        y=z ;
        for(int w : z){
            System.out.println(w);
        }
    }
}
