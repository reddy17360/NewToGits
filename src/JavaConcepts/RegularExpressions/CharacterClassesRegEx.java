package JavaConcepts.RegularExpressions;


import java.util.regex.*;

public class CharacterClassesRegEx {
    public static void main(String[] args){

        Pattern p =  Pattern.compile("[0-9a-z]");

        Matcher m = p.matcher(" sanjaaAAs u0");

        while(m.find()){
            System.out.println(m.start() + "...." + m.group());
        }


    }
}
