package JavaConcepts.CollectionsConcept.ListDemo.SetDemo;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetsDemo {
    public static void main(String[] args){
        //it will store data according to some sorting order without duplicates
        TreeSet s = new TreeSet( );
        //underlying DS is balanced tree
        s.add(new StringBuffer("K"));
        s.add(new StringBuffer("Z"));//// Z.compareTo(K)//
        s.add(new StringBuffer("A"));
        s.add(new StringBuffer("A"));
        System.out.println(s);

        }

}
