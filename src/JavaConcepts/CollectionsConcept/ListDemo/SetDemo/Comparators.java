package JavaConcepts.CollectionsConcept.ListDemo.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparators   {
    public static void main(String[] args){
        TreeSet ts = new TreeSet(new ComparatorDemo());
        ts.add("sanju");
        ts.add("venku");
        ts.add("manju");
        ts.add("nikhil");
        ts.add("girani");
       // System.out.println(ts);

        TreeSet ts1 = new TreeSet (new ComparatorDemo());
        ts1.add(new StringBuffer("r"));
        ts1.add(new StringBuffer("sanju"));
        ts1.add(new StringBuffer("ra"));
        ts1.add(new StringBuffer("seethaxyz"));
        ts1.add("cricket");
        ts1.add("crickes");
        System.out.println(ts1);
    }

}
class ComparatorDemo implements Comparator {

    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        if (s1.length() == s2.length()) {
            return s1.compareTo(s2);
        }
        return Integer.compare(s1.length(), s2.length());
    }
}

