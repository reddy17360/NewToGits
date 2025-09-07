package JavaConcepts.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharacterClasses {
//    public static void main(String[] args){
//        Pattern p = Pattern.compile("^sanju");
//        Matcher m = p.matcher("sanjucjhgbjhjhcbbcsanju");
//        while(m.find())
//        System.out.println(m.start() + " ... " + m.group());
//    }

    public static void main(String [] args){
        //to split the target string according to a particular pattern
        Pattern p = Pattern.compile("\\.");
        String[] s= p.split("Durga.soft.soln");
       for(String s1 : s)
            System.out.println(s1);

        String sc = "Durga.soft.soln";
        String[] sc1 = sc.split("\\.");
        for(String sc2 : sc1)
            System.out.println(sc2);
        }



}
