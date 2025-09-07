package JavaConcepts.FilesJava.FilesPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//program for deleting the specified data from file2 by comparing with file1
public class Program3 {
    public static void main(String[] args) throws IOException {
        PrintWriter pr = new PrintWriter("file3.txt");

        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        String linef1 = br1.readLine();

        while(linef1 != null){
            boolean avl=false;
            BufferedReader br2 =new BufferedReader(new FileReader("file2.txt"));
            String linef2= br2.readLine();
            while(linef2 != null){
                if(linef1.equals(linef2)){
                    avl=true;
                    break;
                }
              linef2 =  br2.readLine();
            }
            if(avl == false){
                pr.println(linef1);
                pr.flush();
            }
            linef1 = br1.readLine();

        }




    }
}
