package JavaConcepts.Threads.ThreadPools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPools implements  Runnable{

    public void run(){

        System.out.println(Thread.currentThread().getName() + " started the execution");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName() + " Done my task");
    }

}
public class ThreadPoolsDemo {
    public static void main(String[] sanju){


        ExecutorService service = Executors.newFixedThreadPool(4);
        for(int i=1;i<=10;i++)
        service.submit(new ThreadPools() );
    }
}
