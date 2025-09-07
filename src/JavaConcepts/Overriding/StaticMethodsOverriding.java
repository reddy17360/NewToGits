package JavaConcepts.Overriding;
class Pa{
    public     void m(int... x){
        System.out.println("Parent");
    }
}
class Ch extends Pa{
    public   void m(){
        System.out.println("child");
    }
}
public class StaticMethodsOverriding {

    public static void main(String[] args){
        Pa pp = new Pa();
        pp.m();
        Ch cc = new Ch();
        cc.m();
        Pa p = new Ch();
        p.m();
    }
}


