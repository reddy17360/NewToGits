package JavaConcepts.Variables;

public class VarArgEquivalanceWith1DArray {
    public static String s ;;
    public static void main(String... args){

        System.out.println("when ever the 1d array is present.. we can easily replace it with var-arg method");

        //m(new int[]{10,20});
        m(10);

        System.out.println(s==null);
    }
    public static void m(int... x){
         for(int xx : x){
             System.out.println(xx);
         }
    }
}
