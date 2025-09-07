package JavaConcepts.RegularExpressions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program3 {
    public static void main(String[] args) {
        //wap to display all the .txt file from particulr directory

        File f = new File("/Users/sanjeevareddysj/IdeaProjects/JavaPrograms/src/javaconcepts/arrays/programs");

        String[] li = f.list();

        Pattern p = Pattern.compile("[a-z]+[.]javaa");
        int count = 0;
        boolean ede=false;
        for (String s1 : li) {

            Matcher m = p.matcher(s1);
            if (m.find()) {
                count++;
                ede = true;
                System.out.println(s1);
            }
        }
         if(ede==false){
                try {
                    throw new FileNotFoundException();
                } catch (Exception e) {
                    System.out.println("file ella maccha");
                }
            System.out.println("Total number of files " + count);
        }
    }
}
