package JavaConcepts.ExceptionHandling;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ChuckedException  {
//Checked exceptions are exception which are checked by the compiler for
    //the smooth run at runtime

    //Except the RE & its child class , errors and it's child classes all are checked exceptions
    public static void main(String args[])  {

       // PrintWriter pw = new PrintWriter("Three.json");
        try {
//            File myObj = new File("filename.txt");
//            Scanner myReader = new Scanner(myObj);
//            System.out.println("sanju");
            System.out.println(1/0);
        }
        catch (NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }


    }
}
