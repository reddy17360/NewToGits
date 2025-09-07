package JavaConcepts.FilesJava.FilesPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Program2 {
    public static void main(String[] args) throws IOException {
        //wap to file merge oprn where merging should be done by line by line

        PrintWriter pr = new PrintWriter("file3.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
        String f1Line = br1.readLine();
        String f2Line = br2.readLine();

       while(f2Line !=null | f1Line!=null){
          if(f1Line != null) {
              pr.println(f1Line);
          }
           f1Line = br1.readLine();
          String s=null;
          if(f2Line != null && !f2Line.equals("null")) {
              pr.println(f2Line);
          }
           f2Line = br2.readLine();
       }
       pr.flush();







    }
}
