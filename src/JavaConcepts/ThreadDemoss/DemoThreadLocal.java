package JavaConcepts.ThreadDemoss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LocalLocal implements Runnable{
   static int count=0;
    public static ThreadLocal tl = ThreadLocal.withInitial(() -> ++count);
    String tName ;
    LocalLocal(String tName){
        this.tName = tName;
    }
    public void run(){
        System.out.println(tName + "id is " + tl.get());
    }

}
public class DemoThreadLocal {
        public static void main(String[] args) {
            LocalLocal[] l = {
                    new LocalLocal("Thread-1"),
                    new LocalLocal("Thread-2"),
                    new LocalLocal("Thread-3"),
                    new LocalLocal("Thread-4"),
                    new LocalLocal("Thread-5")};

            ExecutorService ser = Executors.newFixedThreadPool(2);
            for (LocalLocal ll : l)
                ser.submit(ll);
        }


}
