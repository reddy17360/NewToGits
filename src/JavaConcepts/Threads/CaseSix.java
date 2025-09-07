package JavaConcepts.Threads;
class Mthreadsix extends Thread{
    public void start(){
        System.out.println("start madle");
    }

//overloading of start()
}
public class CaseSix {
    public static void main(String[] args){
        Mthreadsix m = new Mthreadsix();
        m.start();


        for(int i=0;i<10;i++){
            System.out.println("main");
        }
    }
}
