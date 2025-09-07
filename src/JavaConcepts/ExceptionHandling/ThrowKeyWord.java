package JavaConcepts.ExceptionHandling;

import java.io.IOException;

public class ThrowKeyWord {
   static  ArithmeticException ae =  new ArithmeticException() ;
   static String s = null;
    public static void main(String[] args) throws IOException  {
//to handover user created exception to the jvm manally

     //throw new ThrowKeyWord();
        //System.out.println("sanju");
       try{
           System.out.println(1/0);
       }
       catch (ArithmeticException e){
          throw new NullPointerException();
       }
    }
}
