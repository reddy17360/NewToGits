package JavaConcepts.Threads.ReentrantLockClass;
import java.util.concurrent.locks.ReentrantLock;

class TryLockDemo extends Thread{
   static ReentrantLock l = new ReentrantLock();
    public void run() {

            if (l.tryLock()) {
                System.out.println(Thread.currentThread().getName() + " Get the lock so will be doing my job");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                l.unlock();

            } else
                System.out.println(Thread.currentThread().getName() + " Unfourtunately didn't get the lock so will be doing other task never give up");


    }
}
public class TryLock {


    public static void main(String[] args){
        TryLockDemo t1 = new TryLockDemo();
        TryLockDemo t2 = new TryLockDemo();

        t1.start();
        t2.start();
    }

}
