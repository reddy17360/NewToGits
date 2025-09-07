package JavaConcepts.CollectionsConcept.ListDemo.ListConcepts;

import java.util.Stack;

public class VectorDemo {
    public static void main(String[] args){
        /*A Vector is a growable array — just like ArrayList, but with thread safety by default.
            Stores elements in insertion order
               Allows duplicates
                    Is synchronized (which means thread-safe)*/
//        Vector v = new Vector();
//        v.add(1);
//        v.add(2);
//        v.add(3);
//        v.add(0,1000);
//        v.addElement(2000);
//        System.out.println(v.elementAt(0));
//        System.out.println(v);
//        System.out.println(v.size());
//        System.out.println(v.capacity());

        Stack s= new Stack();

        s.push("200001");
        s.push("200002");
        s.push("200003");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println( s.search("200002"));

    }
}
