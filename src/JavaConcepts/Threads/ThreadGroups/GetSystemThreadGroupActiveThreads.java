package JavaConcepts.Threads.ThreadGroups;

public class GetSystemThreadGroupActiveThreads {
    //fistly we have to get system thread group reference
    public static void  main(String[] vs) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();

           Thread[] t =new Thread[system.activeCount()];
           system.enumerate(t);

           for(Thread t1 : t)
               System.out.println(t1.getName() + "..." + t1.isDaemon());

    }
}
