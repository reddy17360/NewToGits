package JavaConcepts.CollectionsConcept.ListDemo.Maps;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemp {
    public static void main(String[] args){

        TreeMap  tm = new TreeMap();
        tm.put(1 , "asdfds");
        tm.put("adsfsd" , 3000);
        tm.put(4 , 4000);
        tm.put(2 , 2000);
        System.out.println(tm);
        //  System.out.println(tm.comparator());
        System.out.println( tm.firstKey());
        System.out.println(tm.lastKey());

    }

}
class MySortComparator implements Comparator{
    public int compare(Object a , Object b){
        Integer i = (Integer) a;
       Integer ii = (Integer) b;
      return  ii.compareTo(i);
        }

    }

