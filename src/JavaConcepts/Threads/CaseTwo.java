package JavaConcepts.Threads;
class Mthread extends Thread{
    public void run(){
        System.out.println("run");
    }
}
public class CaseTwo {

    public static void main(String[] args){
        Mthread m = new Mthread();
        m.run();
        for(int i=0;i<10;i++){
            System.out.println("main");
        }
    }
}

