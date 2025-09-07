package JavaConcepts.FilesJava.FilesPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Program4 {
    public static void main(String[] args) throws IOException {
        //program to delete duplicate from the given file & create a new file

        PrintWriter pr = new PrintWriter("file3.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        String linef1 = br1.readLine();
        while(linef1 != null){
            Boolean avl=false;
            BufferedReader br2 = new BufferedReader(new FileReader("file3.txt"));
            String linef2 =br2.readLine();
            while(linef2 != null){
                if(linef2.equals(linef1)){
                    avl=true;
                    break;
                }
               linef2= br2.readLine();
            }
            if(avl == false){
                pr.println(linef1);
                pr.flush();
            }
            linef1 = br1.readLine();

        }
    }
}
