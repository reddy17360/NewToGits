package JavaConcepts.FilesJava.FilesPrograms;

import java.io.*;

public class Display {
    public static void main(String[]  args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        File f = new File("file1.txt");
        System.out.println("Number of chars present in the give file : " + f.length());//returns number of chars in file
        int count=0;
        int word=0;
        String line = br.readLine();
        while(line != null){
            count++;
            String[] words= line.split("\\s");
            for(String w : words){
                word++;
            }
            line=br.readLine();
        }
        System.out.println("number of lines present in the give file are :" + count);
        System.out.println("number of words present in the give file are :" + word);





    }
}
