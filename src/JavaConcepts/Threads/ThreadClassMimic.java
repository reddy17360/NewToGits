package JavaConcepts.Threads;
class UserMimic{
    public static void main(String[] args){
        int x=10;
         ThreadParent tp = new ThreadParent();
         tp.start();
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadClassMimic extends ThreadParent {
   public void run(){

   }
}
class ThreadParent{
    public void start(){
        System.out.println("sanju");
    }
}
