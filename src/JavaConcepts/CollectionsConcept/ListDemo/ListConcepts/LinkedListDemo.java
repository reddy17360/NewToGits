package JavaConcepts.CollectionsConcept.ListDemo.ListConcepts;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){

     /*which is a linear data structure where the elements are not stored in contiguous
     locations, and every element is a separate object with a data part and an address part.
     The elements are linked using pointers and addresses, and each element is known as a node.
      */
        LinkedList l = new LinkedList();
        l.add("sanju");
        l.add("reddy");
        l.add("Abd");
        l.add("Rajat");
        System.out.println(l);
        l.addLast("patidar");
        l.addFirst("ss");
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
        l.add(2 , "venku");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println( l.get(1));
    }
}
