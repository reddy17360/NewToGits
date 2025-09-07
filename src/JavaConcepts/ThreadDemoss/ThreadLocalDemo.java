package JavaConcepts.ThreadDemoss;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalDemo {
   public  static ThreadLocal tl = new ThreadLocal();
    public static void main(String[] args){


        System.out.println(tl.get() + " excuted by " + Thread.currentThread().getName());
        tl.set("Reddy");
        System.out.println(tl.get() + " excuted by " + Thread.currentThread().getName());
        sanju();
        sanjus();

        dudu d = new dudu("automation");
        Thread t = new Thread(d);
        t.start();


    }

    public static void sanju(){
        System.out.println(tl.get() +  " excuted by " + Thread.currentThread().getName());
    }

    public static void sanjus(){
        System.out.println(tl.get() +  " excuted by " + Thread.currentThread().getName());
    }
}
class dudu implements Runnable{
    String name;
    dudu(String name){
        this.name = name;
    }

    @Override
    public void run() {
        ThreadLocalDemo.tl.set("sanjeevreddy");
        System.out.println(ThreadLocalDemo.tl.get() + " excuted by " + Thread.currentThread().getName());
    }
}
