package JavaConcepts.RegularExpressions;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args){
//rules - number must be either 10 11 / 12 digits
// first digit should be 7/8/9
//nation code should be +91/0
       // Pattern p = Pattern.compile("[7-9][\\d]{9}")  ;
      //  {6}	Match exactly 6 repetitions of that pattern
        Scanner sc = new Scanner(System.in);
        String str=  sc.nextLine();

        Pattern p = Pattern.compile("(91|0)?[7-9][0-9]{9}");
        Matcher m = p.matcher(str);
        if(m.find() && (m.group().equals(str))){
            System.out.println("valid phone nuber " + m.group());
        }else {
            System.out.println("Phone number must be 10-12 digits only , please enter valid one");
        }

    }
}
