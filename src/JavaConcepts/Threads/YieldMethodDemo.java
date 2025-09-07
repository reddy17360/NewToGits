package JavaConcepts.Threads;

import com.sun.security.jgss.GSSUtil;

class YieldChild extends Thread{
    static Thread mainThreadObject ;
    public void run()  {
        try {
            mainThreadObject.join();
        }catch (InterruptedException e){}
        for(int i=0;i<10;i++)
            System.out.println("Seetha thread");
    }
}
public class YieldMethodDemo {
    //main is waiting until completion of child
    public static void main(String[] args){
       YieldChild.mainThreadObject = Thread.currentThread();
       YieldChild yc = new YieldChild();
       yc.start();
       for (int i=0;i<10;i++)
           System.out.println("Rama thread");

    }

}
