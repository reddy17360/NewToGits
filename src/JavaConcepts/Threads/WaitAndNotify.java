package JavaConcepts.Threads;
class DemoWaitAndNotify extends  Thread{
    int total=0;

    public void run() {
        synchronized (this) {
            System.out.println("child started the calculations");
            for (int i = 10; i <= 20; i++) {
                total = total + i;
            }
            System.out.println("child giving the notification ");
            this.notify();
        }
    }
}
public class WaitAndNotify  {

    public static void main(String[] sanju) {
         WaitAndNotify e= new WaitAndNotify();
         DemoWaitAndNotify d = new DemoWaitAndNotify();
             d.start();
             synchronized (d) {
                 System.out.println("main is waiting for some calculations");
                 try {
                     d.wait();
                 } catch (InterruptedException ee) {
                 }

                 System.out.println("sum of x is " + d.total);

             }

    }
}
