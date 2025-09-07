package JavaConcepts.CollectionsConcept.ListDemo.ListConcepts;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){

        //collection -- if you want to represent a group of indivizual objects as a single entity
        //duplicates are allowed & insertion order is preserved - list
        //arraylist - we always talks about in the context of the index in AL
        //Think of it as a dynamic array — it grows and shrinks automatically when you add/remove elements.
        ArrayList l = new ArrayList();
        l.add(10000);
        l.add(2000);
        System.out.println(l);
        ArrayList ll = new ArrayList();
        ll.add(10);
        ll.add(10); ll.add(10); ll.add(10); ll.add(10); ll.add(10); ll.add(10);
        l.addAll(ll);
        System.out.println(l);
        l.addAll(1, ll);
        System.out.println(l);
        System.out.println(l.get(8));
        System.out.println(l.containsAll(ll));
        System.out.println(ll.containsAll(l));
        System.out.println(l.retainAll(ll));
        System.out.println(l);
        System.out.println(l.size());


    }
}
