package JavaConcepts.Overriding;
class Parents{
    public void m(int... x){
        System.out.println("Parents");
    }
}
class Childs extends  Parents{
    public void m(int y){
        System.out.println("Childs");
    }
}
public class VarArgMethodOverriding {
    public static void  main(String [] sanju){
        Parents p = new Parents();
        int[] a = {1,2,3,45,4};
        p.m(a);
        Childs c = new Childs();
        c.m(5);

        Parents parents = new Childs();
        parents.m(10);
    }
}
