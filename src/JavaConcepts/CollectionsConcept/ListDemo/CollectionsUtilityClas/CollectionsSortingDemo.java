package JavaConcepts.CollectionsConcept.ListDemo.CollectionsUtilityClas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortingDemo {
    public  static void main(String[] args) {


        ArrayList l = new ArrayList();
        l.add("Sanju");
        l.add("Anju");
        l.add("dumm");
        l.add("yyy");
      //  l.add(null);
       l.add(1);
        System.out.println(l);
     //   Collections.sort(l);
        System.out.println(l);
        Collections.sort(l , new Mycom());
        System.out.println(l);
    }

}
class Mycom implements Comparator{
     public int compare(Object o1 , Object o2){
         return     o2.toString().compareTo(o1.toString());

     }
}

