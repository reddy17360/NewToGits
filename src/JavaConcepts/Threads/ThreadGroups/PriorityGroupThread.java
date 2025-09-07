package JavaConcepts.Threads.ThreadGroups;

public class PriorityGroupThread {
    public static void main(String[] venku){
//Theads in the threadgorup that already have a higher priority are no affected
        ThreadGroup g1 = new ThreadGroup("tg");
        g1.setMaxPriority(6);
        Thread t1 = new Thread(g1 , "FirstThread");

        Thread t2 = new Thread(g1 , "SecondThread");

        Thread t3 = new Thread(g1 , "ThirdThread");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}
