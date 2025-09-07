package JavaConcepts.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidation {
    public static void main(String[] args){



        //rules - it should contains chars
        //it may contains special char _ .
        //it may be hotmail gmail email yahooo ect
        //Match a string that contains one or more alphanumeric characters.

        Pattern p = Pattern.compile("[a-zA-Z0-9_.]+@[a-z]+([.][a-z]+)*");
        Matcher m = p.matcher("sanju@gmail.com.sanju");
        if(m.find()){
            System.out.println("valid email");
        }else
            System.out.println("invalid email id");
    }
}
