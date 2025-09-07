package JavaConcepts.Arrays.Programs;

public class EqualArray {
    public static void main(String args[]) {

        int[] a = {11, 22, 33, 44};
        int[] b = {11, 22, 33, 44};
        boolean f = (arrayEqual(a, b));
        if(f==false)
            System.out.println("both arrays are equal");
    }

    static boolean arrayEqual(int[] a, int[] b) {
        boolean flag = false;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                flag=false;
                if (a[i] != b[i])
                    flag = true;
            }

        }
        return flag;
    }
}