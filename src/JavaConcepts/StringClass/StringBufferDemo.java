package JavaConcepts.StringClass;

public class StringBufferDemo {
    public static void main(String[] args){
        String s = new String();
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("sanjeevreddyqwww");
        System.out.println(sb.capacity());
        sb.append("sa");
        System.out.println(sb.capacity());

        StringBuffer sbb = new StringBuffer(100);
        System.out.println(sbb.capacity());


        StringBuffer ss = new StringBuffer(new String("sanju"));
        System.out.println(ss.capacity());
        String sss = new String(new StringBuffer("sanjure"));
        System.out.println(sss.length());

 Integer i = new Integer("10");
        Boolean b = new Boolean("True");



    }
}
