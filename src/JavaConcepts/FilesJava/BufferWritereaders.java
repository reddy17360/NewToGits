package JavaConcepts.FilesJava;

import java.io.*;

public class BufferWritereaders {
    //in order to overcome the issue of fr & fw we go for br & bw

    public static void main(String[] args) throws IOException {
        //buffer writer used to write the data to the file
        //here there is no need of writing \n to make a new line instead we go for newLine()

        BufferedWriter bw = new BufferedWriter(new FileWriter("absanju.txt"));
        bw.write(100);
        char[] ch ={'q' , 'w'};
        bw.newLine();
        bw.write(ch);
        bw.newLine();
        bw.write("sanureddysannju");
        bw.newLine();
        bw.write("sanureddysannju");
        bw.newLine();
        bw.write("sanureddysannju");
        bw.newLine();
        bw.write("sanureddysannju");  bw.newLine();
        bw.write("sanureddysannju");

        bw.flush();

        //to read the data from the file BR
        BufferedReader br = new BufferedReader(new FileReader("absanju.txt"));

//        int i =br.read();//reads single char & returns unicode of corresponding value
//        System.out.println((char)i);
//        char[] c = new char[10];
//       int s = br.read(c);//return enough chars from file to array & returns number of values copies
//       for(char ss : c)
//           System.out.println(ss);
//        System.out.println(s);

        String line =  br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }




    }
}
