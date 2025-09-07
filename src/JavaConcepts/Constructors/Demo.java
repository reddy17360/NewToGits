package JavaConcepts.Constructors;

public class Demo  {
     int x=10;

    Demo(int x){
         // super();
        this("Sanju");
        System.out.println("Child");
    }
    Demo(String s){

        System.out.println("demo");
    }

    public static void  main(String args[]){

        Demo demo  = new Demo(10);
      //  Demo d = new Demo();
        //Demo ds = new Demo("Sanju");
       // demo.m1();
    }
}
//class Demo1 extends  Demo {
//    int x=100;
//
//    Demo1(){
//    //    super();
//        System.out.println("reddy");
//    }
//
//    Demo1(int x){
//        this();
//    }
//
//    public void m1(){
//        System.out.println(super.x);
//        System.out.println(this.x);
//    }
//}
