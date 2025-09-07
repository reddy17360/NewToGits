package JavaConcepts.InheritanceBro;
class A{
    public void a(){
        System.out.println("Parent");
    }
}
class Bbb extends A{
    public void b(){
        System.out.println("child");
    }
}
public class InheritanceClass extends A {
    public static void main(String args[]){
        Bbb b = new Bbb();
        b.b();
        b.a();
        A a = new A();
        a.a();


    }
}
