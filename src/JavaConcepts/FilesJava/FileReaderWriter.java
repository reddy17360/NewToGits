package JavaConcepts.FilesJava;

import java.io.*;

public class FileReaderWriter {
    //to write text data to the file we go for writers
    public static void main(String[] args) throws IOException {

        FileWriter fr = new FileWriter("abcs.txt" );
        fr.write('d');
        char[] ch ={'a' ,'b'};
        fr.write('\n');
        fr.write(ch);
        fr.write('\n');//drawback is if we want to add newline everytime we have to enter \n manaully
        fr.write("sanju");
       fr.flush();



        //to read data from the file we go for filereader
        FileReader fw = new FileReader("abcs.txt");
        int i=fw.read();
        File f = new File("abcs.txt");
        char[] c = new char[5];
        System.out.println((fw.read(c)));

           while(i != -1 ){
            System.out.println((char) i);
              i=fw.read();
           } // here we can read the data char by char so we are moving to bufferreaders&writers










    }
}
