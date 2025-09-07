package JavaConcepts.Threads;

public class WaitNotify extends Thread{
    int total =0;
    public void run() {
        System.out.println("child thread starts it's execution");
        synchronized (this){
            for(int i=1;i<=10;i++){
                total = total + i ;
            }
            System.out.println("child thread giving the notify");
            this.notify();
        }
    }
}
class ThreadB {
    public static void main(String[] sanju) throws InterruptedException{

        WaitNotify w = new WaitNotify();
        w.start();
        System.out.println("main thread calling wait");
        synchronized (w) {
            w.wait();
            System.out.println("main thread got notification");
            System.out.println(w.total);
        }
    }
}
