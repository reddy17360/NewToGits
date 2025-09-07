package JavaProg2;

import java.util.Scanner;

public class FindVowels {

    public static void main(String[] args){


        // vowelCon();
        removeWhiteSpacess();
    }

    static void vowelCon() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                System.out.println(ch[i] + " is an vowel");
             else
                System.out.println(ch[i] + "  is an consonants");
        }
    }

        static void removeWhiteSpacess(){
            Scanner sc1 = new Scanner(System.in);
            String str1 = "  reddy      ";
            String s="ss";


            System.out.println( str1.trim());
            System.out.println(s);
        }

    }


