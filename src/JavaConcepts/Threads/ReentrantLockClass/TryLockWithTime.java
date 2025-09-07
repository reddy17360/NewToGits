package JavaConcepts.Threads.ReentrantLockClass;

import JavaConcepts.Arrays.Programs.DeletionOfSelectedElement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class TryLockWithTimeDeom extends  Thread{

    static ReentrantLock l = new ReentrantLock();
    public void run()
    {
        do{
            try{
                if(l.tryLock(2000 , TimeUnit.MILLISECONDS)) {
                     System.out.println(Thread.currentThread().getName() + " Got the lock");
                    Thread.sleep(30000);
                    System.out.println(Thread.currentThread().getName() + " releaese the lock as it's got completed");
                    l.unlock();
                    break;
                 }else
                System.out.println(Thread.currentThread().getName() + "not get the lock will try again");
            }
            catch(InterruptedException e){}
        }while(true);
    }
}
public class TryLockWithTime {

    public static void main(String[] sanju){

        TryLockWithTimeDeom t1 = new TryLockWithTimeDeom();
        TryLockWithTimeDeom t2 = new TryLockWithTimeDeom();
        t1.start();
        t2.start();
    }
}
