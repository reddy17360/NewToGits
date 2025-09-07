package JavaConcepts.Threads;

import javax.swing.plaf.TableHeaderUI;

class ThreadYield extends  Thread{
    static Thread y;
    public void run() {
        try {
            y.join();
            for (int i = 0; i < 10; i++) {
                System.out.println("child");
                // Thread.yield();//it will puase the current executing thread , to give
                // the chance the for the remaining waiting thread of same priority
            }
        }
        catch (InterruptedException e){}
    }
}
public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
         ThreadYield.y = Thread.currentThread();
        ThreadYield ty = new ThreadYield();//executed by main thread
        ty.start(); //from here onwards we have 2 threads

        for (int i=0;i<10;i++)
            System.out.println("Main");

    }
}
