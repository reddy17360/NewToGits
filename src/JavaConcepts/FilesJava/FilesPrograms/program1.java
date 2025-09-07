package JavaConcepts.FilesJava.FilesPrograms;

import JavaConcepts.FilesJava.PrintWriters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class program1 {
    public static void main(String[] args) throws IOException {

      //wap to merge data from 2 files into a 3rd file

        PrintWriter pr = new PrintWriter("file3.txt");

        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        String line = br1.readLine();
        while(line != null){
            pr.println(line);
            line = br1.readLine();
        }
        br1 = new BufferedReader(new FileReader("file2.txt"));
         line = br1.readLine();
        while(line != null){
            pr.println(line);
            line = br1.readLine();
        }

        pr.flush();
        pr.close();
        br1.close();

    }
}
