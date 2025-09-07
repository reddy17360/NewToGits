package JavaConcepts.StringClass;

public class StringMethods {
    public static void main(String[] args){
        String s = new String("sanju");
        String s1 = new String("Durga");

      //  System.out.println(s.charAt(2));//return the char locating at specified index

        System.out.println(s.concat("reddy"));
        System.out.println(s.substring(1));
        //returs the substring from the given beginning index to the end of the given string
        try{
        System.out.println(s.substring(1,5));
        //it returns the string from the beginning index to till end index-1
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("limit mirtha ediay ninu , nin limit alli eru");
        }
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String s3 = new String(" sanaju ");
        System.out.println(s3);
        System.out.println(s3.trim());//remove the whites/blank space at the both ends

        System.out.println(s3.indexOf('a'));
        //returns the index of first occurrence of the given char
        System.out.println(s3.lastIndexOf('a'));
        //returns the index of last occurrence of the give char

        String i1 = new String("ab");
        String i2 = new String("reddy");
         String i3 = i1.toUpperCase();
         String i4 = i1.toLowerCase();
        System.out.println(i1==i3);
        System.out.println(i1==i4);
        System.out.println(i1.compareTo(i2));
        //it will compare two string lexicographically ,
        //it compares based on unicode values of each character in the strings
      //  System.out.println(i1.indexOf('v' , 8));




    }
}
