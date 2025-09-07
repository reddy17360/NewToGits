package JavaConcepts.Threads;

class MthreadSeven extends Thread{
    public void start(){
        super.start();
        System.out.println("start");
    }
    public void run(){

        System.out.println("run");
    }
//using super inside start
}
public class CaseSeven {
    public static void main(String[] args){
        MthreadSeven m = new MthreadSeven();
        m.start();
        m.start();


        for(int i=0;i<10;i++){
            System.out.println("main");
        }
    }
}

