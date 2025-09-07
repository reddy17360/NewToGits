package JavaConcepts.Threads;
class A{
    public void d1(B b){
        System.out.println("thread starts d1 exectuion");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        System.out.println("thead1 try to call last of B");
        b.last();
    }
  public  void last(){
      System.out.println("inside a last");
    }
}
class B{
    public void d2(A a){
        System.out.println("thread starts d2 exectuion");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        System.out.println("thead1 try to call last of A");
        a.last();
    }
    public  void last(){
        System.out.println("Inside b last");
    }
}
public class DeadLockSituation extends Thread{
    A a = new A();
    B b = new B();
    public static void main(String[] sanju) {

        DeadLockSituation d = new DeadLockSituation();
        d.m();

    }
    public void run(){
        b.d2(a);
    }
    public void m(){
        this.start();
        a.d1(b);

    }
}
