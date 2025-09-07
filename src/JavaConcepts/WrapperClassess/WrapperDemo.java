package JavaConcepts.WrapperClassess;

import java.time.temporal.ValueRange;

public class WrapperDemo {
    public static void main(String[] args){
//valueOf()
         Integer i = Integer.valueOf(10);//just creates a wrapper object for the given string/primitive
        //to wrap primitive into object form , so that we can handle primitive as just like object
        Integer ii = Integer.valueOf("100" , 2);
        System.out.println(ii);

        System.out.println(ii.byteValue());//to get the primitive of given wrapper object
        System.out.println(ii.shortValue());
        System.out.println(ii.intValue());
        System.out.println(ii.longValue());
        System.out.println(ii.floatValue());
        System.out.println(ii.doubleValue());
//
//        Character c = Character.valueOf('a');
//        System.out.println(c.charValue());

//         Boolean b = Boolean.valueOf("trUE");
//        System.out.println(b.booleanValue());
//
//
//
        //parseXXX() --> to convert string to primitive
        Integer is = Integer.valueOf("sanju");
        int in= Integer.parseInt("10");
        boolean bb = Boolean.parseBoolean("True");
        System.out.println(bb);


//
//        //public String toString()--> to convert wrapper object to String
//        Double d= Double.valueOf(10.4);
//        System.out.println(d.toString());
//
//        //public static String toString(primitive p)--> convert primitive to string
//        String s=Integer.toString(10);
//        System.out.println(s);

    }
}
