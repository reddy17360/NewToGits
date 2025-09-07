package JavaConcepts.CollectionsConcept.ListDemo.CursorsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCursor{
    public static void main(String[] args){

        //we can apply it for any collection
        //we can read & remove the element
        //most widely used cursor
        ArrayList v = new ArrayList();
        v.add("sanju");
        v.add("reddy");
        v.add("manju");
        v.add("virat");
        v.add("kohli");
        v.add("abd");
        v.add("rajat");
        v.set(0 , "reddyreddy");
        for(int i=0;i<v.size();i++){
              v.set(i , 1);
        }
        System.out.println(v);

        Iterator itr = v.iterator();
        while(itr.hasNext()){
            itr.next();//You must call .next() before .remove() — otherwise,
            // Java doesn’t know what element to remove.
           itr.remove();
        }
        System.out.println(v);


    }
}
