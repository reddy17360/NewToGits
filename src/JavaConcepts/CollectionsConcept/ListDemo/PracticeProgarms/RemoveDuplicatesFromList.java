package JavaConcepts.CollectionsConcept.ListDemo.PracticeProgarms;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromList {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("sanju");
        al.add("reddy");
        al.add("sanju");
        al.add("reddy");
        al.add("sanju");
        al.add("reddy"); al.add("sanju");
        al.add("reddy"); al.add("sanju");
        al.add("reddy"); al.add("sanju");
        al.add("reddy"); al.add("sanju");
        al.add("reddy"); al.add("sanju");
        al.add("reddy"); al.add("sanju");
        al.add("reddy");
        System.out.println(al);
        Set<String> unique = new TreeSet<>(al);
        System.out.println(unique);





    }
}
