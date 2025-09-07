package JavaConcepts.Arrays;

public class AnanymousArray {

    //An array without the name such type of array we call it ananymous
    //for one time use we go for it


    public static void sum(int[] x){
        int total =0;
        for(int xx : x){
           total = total + xx ;
        }
        System.out.println(total);
    }
    public static void main(String args[]){
         sum(new int[]{10,20,30,40}); // ananymous array

    }
}
