package JavaConcepts.RegularExpressions;
import  java.util.regex.*;
public class DemoRegEX {
    //whenever we want to represent a group of string according to a particular pattern
    public static void main(String[] args){

        Pattern p = Pattern.compile("^ju");//it just compiles regualr ex into pattern
                     Matcher m = p.matcher("sjuvanju");
                     int count=0;
                     while(m.find()){
                         System.out.println(m.group() + "...." + m.start() + "...." + m.end());
                         count++;
                     }
        System.out.println("total occurences are " + count);


    }
}
