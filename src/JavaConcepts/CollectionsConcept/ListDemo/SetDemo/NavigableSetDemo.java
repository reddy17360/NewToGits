package JavaConcepts.CollectionsConcept.ListDemo.SetDemo;

import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args){
        //whenever we need more control over sorted sets especially for range & closet matches
        //we can find just less than or greater than of the given element

        TreeSet<String> areoplaneSchedule= new <String>TreeSet();
        areoplaneSchedule.add("8:00");
        areoplaneSchedule.add("8:30");
        areoplaneSchedule.add("8:45");
        areoplaneSchedule.add("9:00");
        areoplaneSchedule.add("9:30");
        areoplaneSchedule.add("9:45");
        areoplaneSchedule.add("10:00");
        System.out.println(areoplaneSchedule);
        System.out.println(areoplaneSchedule.floor("9:00"));
        System.out.println(areoplaneSchedule.lower("9:00"));

        System.out.println(areoplaneSchedule.ceiling("9:00"));
        System.out.println(areoplaneSchedule.higher("9:00"));





    }
}
