package JavaConcepts.CollectionsConcept.ListDemo.Maps;

import java.util.Hashtable;
import java.util.TreeSet;

public class HashTableDemo {
    public static void main(String[] args){
        Temp t1 = new Temp(1);
        Temp t12 = new Temp(11);
        Temp t13 = new Temp(13);
        Temp t14 = new Temp(2);
        Temp t15 = new Temp(4);

        System.out.println(t1.hashCode());
        Hashtable ht = new Hashtable();
          ht.put(t1 , "sanju");
          ht.put(t12 , "reddy");
          ht.put(t13 , "manju");
          ht.put(t14 , "maruti");
          ht.put(t15, "ramesh");
        System.out.println(ht);


    }
}
class Temp {
    int t ;
    Temp(int t){
        this.t = t;
    }
    public int hashCode(){
        return t;
    }
    public String toString(){
        return t+"";
    }

}
