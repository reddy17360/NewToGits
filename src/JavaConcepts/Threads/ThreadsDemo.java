package JavaConcepts.Threads;
class MyThread extends Thread{
    public void run(){
        for (int i=0 ;i<10;i++)
        System.out.println("child thread");
    }
}
public class ThreadsDemo {
    public static void main(String[] args){
        // MyThreadDemo d = new MyThreadDemo();

    }
}
