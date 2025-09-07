package JavaConcepts.Threads;
class Mthreads extends Thread{
    public void run(){
        System.out.println("run");
    }
    public void run(int i ){
        System.out.println("run arg");
    }
//overloading of run()
}
public class CaseFour {
    public static void main(String[] args){
        Mthreads m = new Mthreads();
        m.start();
        m.run(10);

        for(int i=0;i<10;i++){
            System.out.println("main");
        }
    }
}

