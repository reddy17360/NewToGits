package JavaConcepts.CollectionsConcept.ListDemo.CursorsConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args){
        ArrayList v = new ArrayList();
        v.add("sanju");
        v.add("reddy");
        v.add("manju");
        v.add("virat");
        v.add("kohli");
        v.add("abd");
        v.add("rajat");

        ListIterator ltr = v.listIterator();
        while(ltr.hasNext()){
         String s=(String)   ltr.next();
            System.out.println(s);
            if(s.equals("sanju")){
                ltr.remove();
            }
        }
        System.out.println(v);
    }
}
