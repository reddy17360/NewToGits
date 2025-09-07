package JavaConcepts.InnerClass.RegularClassDemos;

public class RegularInner {
    //we can declare a class inside another class
    //"without existing of one type object there is no chance of existing another object" --> works on this principle
    //"lets a without existing of university there is no chance of existing departments
    public static void main(String[] args) {
             C c = new C();
              C.A b = c.new A();
             b.m();
    }
}
class C{
    static int x=10;
    int y=20;
    class A {
        int y=30;
        public void m() {
            int y=40;
            System.out.println("inner class method");
            System.out.println(x);
            System.out.println(C.this.y);

        }
    }
}



