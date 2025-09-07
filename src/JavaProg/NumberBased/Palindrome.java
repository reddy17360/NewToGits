package JavaProg.NumberBased;

public class Palindrome {

    public static void main(String args[]){
        Palindrome palindrome = new Palindrome();
       // palindrome.numberPalindrome();
        palindrome.stringPalindrome();
    }
    public void numberPalindrome() {
        int n = 1211;
        int copy = n;
        int remainder = 0;
        int remaining = 0;

        while (n > 0) {
            remainder = n % 10; // getting the remainder
            remaining = (remaining * 10) + remainder; //storing / tracking the last digit
            n = n / 10; // eliminating the last digit
        }
        if (copy == remaining)
            System.out.println("I'm Palindrome");
        else
            System.out.println("Sorry Bro, I'm not");
    }

    public void stringPalindrome(){
        String str = "appa" ;
        String copy = str ;
       String pali ="" ;

        for(int i = str.length()-1 ; i >= 0 ; i--){
            char ch = str.charAt(i);
                pali  = pali + ch ;

        }
        System.out.println(copy);
        System.out.println(pali);
        if (copy.equals(pali))
            System.out.println("I'm Palindrome");
        else
            System.out.println("Sorry Bro, I'm not");


    }
}
