package JavaConcepts.Threads;
class My extends Thread{

}
public class DaemonThread {
    public static void main(String[] sanju){
        System.out.println(Thread.currentThread().isDaemon());

           // Thread.currentThread().setDaemon(true);
        My m= new My();
        System.out.println( m.isDaemon());
        m.setDaemon(true);
        System.out.println( m.isDaemon());



    }
}
