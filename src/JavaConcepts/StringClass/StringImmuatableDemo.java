package JavaConcepts.StringClass;

public class StringImmuatableDemo {
    public static void main(String[] args){
        String s = new String("sanju");//immutable --> non-changable
         s.concat("reddy");
         System.out.println(s);


         int x=0;
         int y=1;
        System.out.println(x);
        System.out.println(y);

         int sss=1;
         int z=0;
         while(sss<=10){
          z = x + y;
          x=y;
          y=z;
             System.out.println(z);
          sss++;}
    }

}
