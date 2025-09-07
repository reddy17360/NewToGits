package JavaConcepts.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsKeyword {
    public static void main(String [] args)throws FileNotFoundException {
//to hand over the responsibility of exception handling to the caller
            doStuff();
        System.out.println("sanju");
        System.out.println("venku");

    }
 public static void doStuff() throws FileNotFoundException{
        doMoreStuff();
    }
    public static void doMoreStuff() throws FileNotFoundException {

         File f = new File("abc.txt");

        Scanner sc = new Scanner(f);
    }
}
