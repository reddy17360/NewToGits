package JavaConcepts.Threads.ThreadPools;

import java.util.concurrent.*;

class CallableClass implements Callable {
    int n ;
    CallableClass(int n){
        this.n = n;
    }
    public Object call(){
         return (n*(n+1)/2);
         //to find sum of n numbers , n * n+1/2
    }
}
public class CollableDemo {
    public static void main(String[] args)  {
 //task object(runnable/callable]
        CallableClass[] a = {new CallableClass(10) ,
                new CallableClass(20) ,
                new CallableClass(30) ,new CallableClass(40) ,new CallableClass(50) ,
                new CallableClass(60) };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(CallableClass i : a) {
            try {
                Future f = service.submit(i);
                System.out.println(f.get());
            }catch (ExecutionException | InterruptedException e){}
        }
        service.shutdown();

        }

}
