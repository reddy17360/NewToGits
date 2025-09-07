package JavaConcepts.Threads.ThreadLocalVariables;
class TlvDemo extends Thread{

//Now tl becomes instance-specific, meaning:v -- withoux static
//Every TlvDemo object gets its own separate ThreadLocal object.
//So the tl.get() you call inside each thread is not from a shared ThreadLocal.
//Result: it defeats the purpose of ThreadLocal — because each thread now
// has a totally different object, not just a separate copy of the value, but a whole new ThreadLocal itself.

    static int   a=0;
    static ThreadLocal tl = new ThreadLocal(){
        public Object initialValue(){
            return ++a;
        }
    };

    String name;
      TlvDemo(String name){
          this.name=name;
      }
      public void run(){
          System.out.println(Thread.currentThread().getName() + "executed" + tl.get()) ;
      }
}
public class ThreadLocalVariablesDemo {

    public static void main(String[] args){

        TlvDemo t1 = new TlvDemo("Thread-1");
        TlvDemo t2 = new TlvDemo("Thread-2");
        t1.start();
        t2.start();
    }
}
