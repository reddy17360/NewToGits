package JavaConcepts.Threads.ProgrmasPractice;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A implements Runnable {
    String task;
    Thread name;
    A(String task){
      this.task = task;
      this.name = name;
    }
     public void run(){
         switch(task){
             case "sum" :
                 sum();
                 break;
             case  "even":
                 even();
                 break;
             case "odd" :
                 odd();
                 break;
             default:
                 System.out.println("nothing to do" + Thread.currentThread().getName());
         }
     }
     public void sum(){
        int s=0;
        for(int i=1 ;i <=10 ; i++)
            s = s + i;
         System.out.println(Thread.currentThread().getName() + " gave the sum of n numbers: " + s);
     }
    public void even() {
        int s = 0;
        for (int i = 2; i <= 5; i = i + 2)
            System.out.println(Thread.currentThread().getName() + " giving the even numbers: " + i);
    }
    public void odd(){
        for(int i=1 ;i <=5 ; i=i+2)
            System.out.println(Thread.currentThread().getName() + " giving the odd numbers: " + i);

    }
}
public class PrintOddEven {
    public static void main(String[] args){

       A a = new A("even");
        A b = new A("odd");

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(new A("even"));
        service.submit(new A("odd"));
        service.submit(new A("sum"));
        service.shutdown();



    }
}
