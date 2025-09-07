package JavaConcepts.CollectionsConcept.ListDemo.Maps;

import java.io.*;
import java.util.Properties;

public class PropertiesClassDemo {
    public static void main(String[] args) throws IOException {
        //one of the most practical & commonly used classes for handling configuration settings
       // Commonly used to read/write configuration files (.properties files)

        Properties p = new Properties();


        //   FileInputStream fs = new FileInputStream("/Users/sanjeevareddysj/Desktop/sanju.properties");
     BufferedReader br = new BufferedReader(new FileReader("/Users/sanjeevareddysj/Desktop/sanju.properties"));
      p.load(br);
        System.out.println(p.getProperty("usr"));
        System.out.println(p.getProperty("pwd"));
        if(p.getProperty("usr").equals("sanju")){
            p.setProperty("usr" , "sanjeevreddys");
        }
        PrintWriter pr = new PrintWriter("/Users/sanjeevareddysj/Desktop/sanju.properties");
        p.store(pr , "reddy updates");

    }
}
