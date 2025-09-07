package JavaConcepts.Threads;
class MyThreads extends Thread{

}
public class GetSetThread {
    //we can get & set the current thread name
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        //GetSetThread sg = new GetSetThread();

        MyThreads mt = new MyThreads();
        mt.start();
        System.out.println(Thread.currentThread());


    }



}
