package JavaConcepts.Threads.ThreadGroups;

import java.sql.SQLOutput;
import java.time.chrono.ThaiBuddhistEra;
class MyT extends Thread{
     MyT(ThreadGroup g , String name){
       super(g,name);
    }
    public void run(){
        System.out.println("child thread");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){}
    }
}
public class DemoOfThreadGroupClassMethods {
    public static void main(String[] args){

        ThreadGroup pg = new ThreadGroup("ParentGroup"); //creates thread group with specified name
        ThreadGroup cg = new ThreadGroup(pg , "Childgroup");//crates sub-thread group with specified name which belongs to speficed thread group

        MyT m1 = new MyT(pg ,"childThread1");
        MyT m2 = new MyT(pg , "childThread2");
        m1.start();
        m2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
         pg.list();
         ThreadGroup[] t1 =new ThreadGroup[pg.activeGroupCount()];
         pg.enumerate(t1);
        System.out.println();
        System.out.println("These are the threads present in the given group");
         for(ThreadGroup t2 : t1)
             System.out.println(t2.getName());
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){}


    }
}
