package JavaConcepts.FilesJava;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriters {
    public static void  main(String[] args) throws IOException {

        //here also we write the data to the file using PR
    //dis-advantage with BR is still we are using newLine() to add new line it is similar to \n to overcome this

    PrintWriter pr = new PrintWriter("Print.txt");

    pr.println(100);
    pr.println(true);
    pr.println(40.44f);
    pr.println(10.09);
    pr.println('c');
    pr.println("sanjureddyjava");
    pr.flush();




    }
}
