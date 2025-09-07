package JavaConcepts.CollectionsConcept.ListDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LearnSets {
    //if wanna a represent group of indivizual objects as a single
    //entity where duplicates are not allowed & order of insertion is not preserved
    //internally it implemented based on hashtable
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(10);
        hs.add(30);
        hs.add(40);
        hs.add(100);
        System.out.println(hs);

//LinkedHashset , where it
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(10);
        ls.add(20);
        ls.add(20);
        ls.add(10);
        ls.add(30);
        ls.add(40);
        ls.add(100);
        System.out.println(ls);
    }
}
