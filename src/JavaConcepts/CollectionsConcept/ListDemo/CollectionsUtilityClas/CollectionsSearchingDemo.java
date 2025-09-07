package JavaConcepts.CollectionsConcept.ListDemo.CollectionsUtilityClas;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchingDemo {
    public static void main(String[] args){
        ArrayList l = new ArrayList();

        l.add("Sanju");
        l.add("Sanju");
        l.add("Anju");
        l.add("dumm");
        l.add("yyy");



        Collections.shuffle(l);
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);
        System.out.println(Collections.max(l));
        System.out.println(Collections.min(l));
        System.out.println(Collections.frequency(l , "a"));
        Collections.swap(l , 0 ,4);
        System.out.println(l);
      Collections.fill(l , "s");
        System.out.println(l);
        System.out.println(  Collections.binarySearch(l , "dumm"));
        System.out.println(  Collections.binarySearch(l , "reddy"));
    }
}
