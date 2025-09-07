package JavaConcepts.StringClass;

public class ConstructorsInString {
    public static void main(String[] args){

        String s1 =new String();//creates an empty string object
        //i.e with zero length
        System.out.println(s1.length());
        String s2="";
        System.out.println(s2.length());
        System.out.println((s1.equals(s2)));
        String s3=null;
        System.out.println(s3);
        System.out.println((s1 == s3));

        String s5 = new String("Durga");
        //creates an equivalent string object for the given string literal
        System.out.println(s5.length());
        StringBuffer s4 = new StringBuffer("sanju");
        String s6 = new String(s4);
        System.out.println(s6.length());

        char[] c = {'a' , 'b' , 'c' , 'd'};

        String sc = new String(c);
        //creaates an equivalent string object for the given char array
        System.out.println(sc);
        System.out.println(sc.length());

        byte[] b = {100,101,102};
        String sb = new String(b);
        System.out.println(sb);


    }
}
