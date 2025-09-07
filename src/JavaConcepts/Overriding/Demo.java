package JavaConcepts.Overriding;

import java.io.IOException;

class Parent{
    public void property(){
        System.out.println("Gold, land & cash");
    }
        public   void marry()throws Exception{
         System.out.println("dum dum");
     }
}
 class Child extends Parent{
       public  void marry() throws IOException {
           System.out.println("Final");
     }
}
public class Demo {
    public static void main(String[] args) {


        Parent parent1 = new Child();
        parent1.property();
        Child c = new Child();
        try {
            c.marry();
        }
        catch (Exception e){

        }



    }
}
