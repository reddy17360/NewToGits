package JavaConcepts.RegularExpressions;

import java.io.*;
import java.lang.reflect.ParameterizedType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program2 {
    //WAP to read all mobile numbers present in the given input file where is has user info & dump into the output file
    public static void main(String[] args) throws IOException {

        //fetchMobileNumbers();
        fetchEmailsFromFile();

    }

    static void fetchMobileNumbers() throws IOException {
        PrintWriter pr = new PrintWriter("file3.txt" );
        Pattern p = Pattern.compile("(91|0)?[7-9][0-9]{9}");

        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line != null) {
            Matcher m = p.matcher(line);
            if (m.find()) {
                pr.println(m.group());
            }
            line = br.readLine();
        }
        pr.flush();
        pr.close();
    }

    public static void fetchEmailsFromFile() throws IOException {
        PrintWriter pr = new PrintWriter("file2.txt" );
        Pattern p = Pattern.compile("[a-zA-Z0-9_.]+@[a-zA-Z]+([.][a-z]+)*");

        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line != null) {
            Matcher m = p.matcher(line);
            if (m.find()) {
                pr.println(m.group());
            }
            line = br.readLine();
        }
        System.out.println(System.getProperty("user.dir"));
        pr.flush();
        pr.close();
    }
    }
