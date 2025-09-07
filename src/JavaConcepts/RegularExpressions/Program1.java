package JavaConcepts.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program1 {
    //wap to represent all valid 10 digit mobile numbers
    //we can define character by character patterns
    public static void main(String[] args){


      //  validPhone("919829043543");

     //  validEmailId("@gmail.com");
        passwordField("sandy");
    }
    public static void validPhone(String s){

        Pattern p = Pattern.compile("^(0|91)+[7-9][0-9]{9}");
        Matcher m = p.matcher(s);
        if(m.find() && m.group().equals(s)){
            System.out.println("valid number");
        }
    }
    public static void validEmailId(String s){
        //sanju453898#$%_.@gmail.com
        //[a-zA-Z0-9] ---> Match any single character that is:
        //[a-zA-Z0-9]+  --> Match a string that contains one or more alphanumeric characters.
        //[a-zA-Z0-9]* ---> Match any number (including zero) of letters and digits.
        Pattern p = Pattern.compile("[a-zA-Z0-9]*@gmail.com");
        Matcher m = p.matcher(s);
        if(m.find() && m.group().equals(s)){
            System.out.println("valid email");
        }else {
            System.out.println("here is the clue : xyx@gmail.com");
        }
    }

    public static void passwordField(String s){
        //requirements - password should contain atleast 8 & it should contain one upper case , one special char
        Pattern p = Pattern.compile("[A-Za-z#$%^&*]{8,}+");
        Matcher m = p.matcher(s);
        if(m.find()){
            System.out.println("good");
        }

    }
}
