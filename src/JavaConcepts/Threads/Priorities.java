package JavaConcepts.Threads;
class MyTh extends  Thread{
    public void run(){
        for(int i=0;i<10;i++)
        System.out.println("child thread");

    }
}
public class Priorities {
    public static void main(String[] args){
        System.out.println("Default priority : " +  Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        System.out.println("User provided priority : " + Thread.currentThread().getPriority());
        MyTh m = new MyTh();
       m.setPriority(10);
        m.start();
        for(int i=0;i<10;i++)
            System.out.println("main thread");

    }
}
