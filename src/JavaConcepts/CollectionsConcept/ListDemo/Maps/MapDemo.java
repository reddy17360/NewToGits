package JavaConcepts.CollectionsConcept.ListDemo.Maps;

import java.util.*;

public class MapDemo {
    public static void main(String[] args){
        //if we wanna represent a group of objects a key-value pair/ collection of k-v pair
        //ex : assume the dictionary
        //word-key
        //meaning-value
        HashMap m = new HashMap();
        m.put(1 , "sanju");
        m.put(2 , "reddy");
        System.out.println(  m.put(1 , "venku"));
        System.out.println(m);
        HashMap m1 = new HashMap();
        m1.put("reddy" , "reddy");
        System.out.println(m1);
        m1.putAll(m);
        System.out.println(m1);
        System.out.println(m1.get(1) + " asdfdsf");
        m1.remove(1);
        System.out.println(m1);
        System.out.println(m1.containsKey(2));
        System.out.println(m1.containsValue("reddy"));
        System.out.println(m1.isEmpty());
        System.out.println(m1.size());
          Set k= m1.keySet();
        System.out.println(k);
      Collection v= m1.values();
        System.out.println(v);
      Set en=  m1.entrySet();
        System.out.println(en);

        Iterator ii = en.iterator();
        while(ii.hasNext()){
           Map.Entry mm = (Map.Entry) ii.next();
            System.out.println(mm.getKey() + "....." + mm.getValue());
            if(mm.getValue().equals("reddy"))
            {
                mm.setValue("sanju");
            }
        }
        System.out.println(en);
//only difference b/w HM & LHM is LHM is presever the order of insertion
        HashMap<Integer , String> m3 = new HashMap();
        m3.put(1 , "one");
        m3.put(2, "two");
        m3.put(6 , "ajdlj");
        m3.put(3 ,"three");
        m3.put(4, "four");
        System.out.println(m3);

        for (Map.Entry entry : m3.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        Integer I =  100000;
        Integer I1 = 100000;


         HashMap m4 = new  HashMap();
        System.out.println(I.toString());
        System.out.println(I1.toString());
        m4.put(I , "reddy");
        m4.put(I1 , "reddy");
    //    System.out.println(m4);

//IdentityHashMap - only differecne b/w HS & IHM
        //in HS JVM uses .equls method to identify duplicates , where equals() is meant for content comparison
        //where in IHM jvm users == operator to identify duplicates , it is meant for address comparison

        IdentityHashMap i = new IdentityHashMap();



        i.put(I , "reddy");
        i.put(I1 , "reddy");
        System.out.println(m4);
        System.out.println(i);
    }
}
