package JavaConcepts.Arrays.Programs;

public class CopyArray {
    public static void main(String[] args){
        int[] a = {1,2,3,4};

        int [] b = a;
     // System.out.println(b.length);
        for(int aa : b)
            System.out.println(aa);
    }
}
