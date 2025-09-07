package JavaProg.NumberBased;

import java.util.Scanner;

public class CountVowelNConsonents {
      int vowel = 0;
      int consonents = 0;

    public static void main(String[] args) {

        CountVowelNConsonents c = new CountVowelNConsonents();
        c.countOfVoCo();
    }
    public   boolean vowels(char ch) {
        int con=0 , vow=0;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowel in the given string " );
            System.out.print( ch + "\t");
            return true;

        }else {
            System.out.println("consent in the given string " );
            System.out.print( ch + "\t");
            return false;
        }
    }
    public void countOfVoCo() {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels(ch))
                    vowel++;
                else
                    consonents++;
            }
        }
        System.out.println();
        System.out.println("Number of vowels in given string are" + vowel);
        System.out.println("Number of consonents in given string are" + consonents);
    }

}


