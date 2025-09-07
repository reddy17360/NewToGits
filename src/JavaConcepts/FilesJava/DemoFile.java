package JavaConcepts.FilesJava;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/sanjeevareddysj/downloads" , "venku.txt");
        System.out.println(  f.exists());
        f.createNewFile();
        System.out.println(  f.exists());
    }
}
