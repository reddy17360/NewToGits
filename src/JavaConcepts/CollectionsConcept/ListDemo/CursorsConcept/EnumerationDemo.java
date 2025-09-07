package JavaConcepts.CollectionsConcept.ListDemo.CursorsConcept;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo{
    public static void main(String[] args){
//In Java Collection Framework, Cursors are tools (interfaces/classes) that help you traverse
// (iterate over) and optionally modify elements of a collection one by one.
//it is only applycable for legacy collection i.e Vector stack
        //we can perform read only operation we can't perform any edition
        Vector v = new Vector();
        v.addElement("sanju");
        v.addElement("reddy");
        v.addElement("manju");
        v.addElement("virat");
        v.addElement("kohli");
        v.addElement("abd");
        v.addElement("rajat");
        System.out.println(v);

        Enumeration e = v.elements();
        System.out.println(e.getClass().getName());
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }




    }
}
