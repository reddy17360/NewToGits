package JavaConcepts.Threads.ReentrantLockClass;

import java.nio.channels.IllegalBlockingModeException;
import java.util.concurrent.locks.ReentrantLock;

class Display{
      ReentrantLock r = new ReentrantLock();
    public void wish(String name){
      r.lock();
        for(int i=1;i<=10;i++){
            System.out.print("Good morning ");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(name);
        }
        r.unlock();
    }
}
public class ReentrantDemo  extends Thread{
      Display d;
      String name;

      ReentrantDemo(Display d , String name){
          this.d=d;
          this.name=name;
      }
    public void run(){
        d.wish(name);
    }
    public static void main(String[] args){
        Display d = new Display();
        ReentrantDemo t1= new ReentrantDemo(d , "sanju");
        ReentrantDemo t2 = new ReentrantDemo(d , "venku");

        t1.start();
        t2.start();
    }

}
