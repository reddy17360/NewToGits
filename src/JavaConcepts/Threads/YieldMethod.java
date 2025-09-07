package JavaConcepts.Threads;
class MyYield extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
            try {
            System.out.println("Seetha Thread");
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}//main is waiting until completion of child
public class YieldMethod {
//if a thead wants to wait until completion of some other thread

    public static void main(String [] args) throws InterruptedException{

        MyYield my = new MyYield();
        my.start();
        my.join(1000 , 100);
        for(int i=0;i<10;i++)
            System.out.println("Rama Thread");
    }
}
