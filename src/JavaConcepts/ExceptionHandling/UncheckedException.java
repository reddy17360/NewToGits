package JavaConcepts.ExceptionHandling;

import java.io.IOException;

public class UncheckedException {

    //Except the RE & its child class , errors and it's child classes all are checked exceptions


    public static void main(String[] args){

        String s = null;

        try{
        System.out.println(s.length());
        System.out.println(1/0);
        }
        catch (NullPointerException e){
            //System.out.println("alli enu ella maccha");
           // System.out.println();
            e.printStackTrace();
        }

    }
}
