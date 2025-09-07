package JavaConcepts;

public class StaticFlowControl {

    static   int x = 10;
     static {
       //  m();
         System.out.println("first static block" + x);
     }
     public static void main(String [] args){
         m();
         System.out.println("main method");
     }
     public static void m(){
         System.out.println(j);
     }
     static {
         System.out.println("2nd static block");
     }
     static int j=20;

}
