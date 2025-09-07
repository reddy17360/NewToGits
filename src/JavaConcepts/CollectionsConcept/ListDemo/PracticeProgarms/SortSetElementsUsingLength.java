package JavaConcepts.CollectionsConcept.ListDemo.PracticeProgarms;

import java.util.Comparator;
import java.util.TreeSet;

public class SortSetElementsUsingLength {
    public static void main(String[] args){

        Comparator c = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String s3 = o1.toString();
                String s4 = o2.toString();
                return s3.compareTo(s4);
//                int s1 = o1.toString().length();
//                int  s2 = o2.toString().length();
//                if(s3.length() == s4.length())
//                    return s3.compareTo(s4);
//                return Integer.compare(s3.length(), s4.length());
//                //it compares two int values numeraccally

        }};

        TreeSet t = new TreeSet( );
        t.add("A");
        t.add("AAAAA");
        t.add("AA");
        t.add("B");
        t.add("BB");
        t.add("BBBB");
        System.out.println(t);

    }
}
