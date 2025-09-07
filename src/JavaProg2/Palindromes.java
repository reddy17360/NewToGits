package JavaProg2;

public class  Palindromes {

    public static void main(String[] args){
     Palindromes pal = new Palindromes();
     pal.strPalindrome("MALAYALAM");
     pal.numPalindrome();
    }


    public void strPalindrome(String str){

        String copyStr=str.toLowerCase(); //need this to comapre at last
        String reverse = "";
        //appa --> it is an palindrome , when we read it is same in both the ways

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.toLowerCase().charAt(i);
        }

        if(copyStr.equals(reverse)){
            System.out.println("it is an palindrome");
        }else
            System.out.println("it is not ");
    }

    public void numPalindrome(){
        //first we have to count number digits , it help to loop in
        //then we have get the last digit  -> get reminder
        //we have to remove the last digit

        int num = 14341;
        int copuNum=num;
        int rev =0;
              while(num>0){
                  int reminder = num % 10 ; //to get last digit
                   rev = (rev * 10 )+ reminder;//building the reverse number
                  num = num/10;//to remove last digit
              }
        if(rev == copuNum){
            System.out.println("it is an palindrome");
        }
        else System.out.println("i'm not");
    }

}
