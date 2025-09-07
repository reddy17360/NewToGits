package JavaConcepts.Threads;

public class ThreadCommunication {
    // threads will be communicate each others by using wait & notify methods

    public static void main(String[] sanju) throws InterruptedException{
        Total t = new Total();
        t.start();
     //   System.out.println("Thread main is waiting for the updates of child");
       synchronized (t){
           System.out.println("main will start");
           Thread.currentThread().notify();
           System.out.println(t.sum);
       }
    }
}
class Total extends Thread {
    int sum;
    @Override
    public void run()  {
        synchronized (this) {
            for (int i = 1; i <= 5; i++)
                sum = sum + i;
            System.out.println("child done");
            try {
                this.wait();
            }catch (InterruptedException e){}
        }
    }
}