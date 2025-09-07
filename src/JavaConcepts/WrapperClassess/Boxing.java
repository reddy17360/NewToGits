package JavaConcepts.WrapperClassess;

public class Boxing {

    static int I;
    public static void main(String[] args){

        //AutoBoxing-->automatic conversion of primitive to wrapper object by compiler
        Integer i = 10;//compiler will converst int to Interger automatically
        //after compiling above line becomes Integer i = Integer.valueOf(10)
        //it means internally autoboxing concept implemented by using valueOf()
        System.out.println(i);

        //AutoUnBoxing-->Automatic conversion of wrapper object to primitive by complier
        Integer s = Integer.valueOf(100);
        int x = s;// compiler will convert Integer to int automatically
        //after compiling above line becomes int x = s.intValue()
        System.out.println(x);

        Integer y= I;
        System.out.println(y);
    }
}
class ImmutableNatureOfWrapperClass{
    //all WCO are immutable
    public static void main(String [] args){

        Integer x = Integer.valueOf("1000");
        Integer y = 1000;
       // x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);

    }
}
