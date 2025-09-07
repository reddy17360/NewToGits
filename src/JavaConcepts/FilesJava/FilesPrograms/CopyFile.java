package JavaConcepts.FilesJava.FilesPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CopyFile {
    public static void main(String[] args) throws IOException {

    }
    static void copyFile() throws IOException {
        //  Use Paths.get() to convert a string path to a Path object.
        Path src = Paths.get("//Users//sanjeevareddysj//IdeaProjects//javaprograms//ff1.txt");
        Path dest = Paths.get("//Users//sanjeevareddysj//IdeaProjects//javaprograms//ffs.txt");
        Files.copy(src , dest );
    }
    static void searchForWord() throws IOException {
        Pattern p = Pattern.compile("sanju");
        BufferedReader br = new BufferedReader(new FileReader("file3.txt"));
        String line = br.readLine();
        while(line != null){
            Matcher m = p.matcher(line);
            

        }
    }
}
