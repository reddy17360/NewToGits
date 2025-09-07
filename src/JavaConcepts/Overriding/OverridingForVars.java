package JavaConcepts.Overriding;

public class OverridingForVars {
   public static void main(String[] args){
       A a =  new A();
       System.out.println(a.x);
       B b = new B();
       System.out.println(b.x);
       A aa = new B();
       System.out.println(aa.x);

      StringBuffer o = new StringBuffer("durga");
        Object s = (Object) o;
   }
}
class A
{
    int x = 100;
}
class B extends A
{
    int x=200;
}
