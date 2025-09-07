package JavaConcepts.StringClass;

public class OperatorEquals {
    public static void main(String[] args){


        String s1 = new String("Durga");
        String s2 = new String("Durga");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
