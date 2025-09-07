package JavaConcepts.Arrays;

import java.util.*;

public class ArraysCLass {
    public static void main(String[] args){
        //it is an utility class working with arrays
        //it will provides a couple of methods to deal with arrays
        Integer[] arr = {1,2,3,44,5,33,22,67};
        Arrays.sort(arr , new Myc());
        for(int a : arr){
            System.out.println(a);
        }
        String[] str = {"a" , "c" , "f" , "b"};
        for(String a : str){
            System.out.println(a);
        }
        List<String> ll= Arrays.asList(str);

     ArrayList s= new ArrayList();
    Object[] obj= ll.toArray();



        Arrays.sort(str);

        for(String a : str){
            System.out.println(a);
        }

        System.out.println(Arrays.equals(arr , str));
       int[] arrs = {1,2,3,44,5,33,22,67};
      int[] cc= Arrays.copyOf(arrs , 20);
        System.out.println(cc.length);
        String ss =Arrays.toString(arrs);


    }

}
class Myc implements Comparator{

    public  int compare(Object a1 , Object a2){
        Integer i1 = (Integer) a1;
        Integer i2 = (Integer) a2;

        return  i2.compareTo(i1);
    }



}
