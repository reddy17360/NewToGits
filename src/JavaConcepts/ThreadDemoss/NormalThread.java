package JavaConcepts.ThreadDemoss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DemoThread implements Runnable{
String name;
    DemoThread(String name){
        this.name = name;
    }
    public void run(){

            System.out.println(name + Thread.currentThread().getName());
    }

}
public class NormalThread  {

public static void main(String[] args) {
    DemoThread[] demoThread = {
            new DemoThread("sanju") ,
            new DemoThread("sanjureddy"),
            new DemoThread("venku"),
            new DemoThread("venkureddy")
             };

    ExecutorService service = Executors.newFixedThreadPool(2);


    for(DemoThread d : demoThread)
        service.submit(d);


    }
}
