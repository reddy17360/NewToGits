package JavaConcepts.FilesJava;

import java.io.File;

public class ListFiles {
    public static void main(String [] args){

        File f = new File("/Users/sanjeevareddysj/downloads");
         String[] s = f.list();
         int count=0;
         for(String s1 : s){
             File f1 = new File(f , s1);
             if(f1.isFile()) {
                 System.out.println(s1);
                 count++;
             }
         }
        System.out.println(count);
    }
}
