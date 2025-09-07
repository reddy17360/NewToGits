package JavaConcepts.CollectionsConcept.ListDemo.ConcurrentCollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrrentexception extends  Thread {
   static ArrayList l = new ArrayList();
    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");
        Concurrrentexception c = new Concurrrentexception();
        c.start();
        System.out.println("main thread iterating list");
        Iterator i = l.iterator();
        while(i.hasNext()){
            String s = (String) i.next();
            System.out.println(s);
            Thread.sleep(2000);
        }

    }
    public void run(){
        System.out.println("child thread updating the list");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        l.add("s");
    }
}

