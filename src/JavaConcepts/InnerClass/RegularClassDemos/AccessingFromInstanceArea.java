package JavaConcepts.InnerClass.RegularClassDemos;

public class AccessingFromInstanceArea {
    public void m2(){
      C c = new C();
      c.m1();
    }
    class C{
        public void m1(){
            System.out.println("inner class method ");
        }
    }

    public static void main(String[] args){
        AccessingFromInstanceArea a = new AccessingFromInstanceArea();
        a.m2();
    }
}
