package JavaConcepts.Arrays.Programs;

import java.util.Arrays;

public class FindLargest {

    //40 , 50 , 60 , 70 , 10 ;
    static void bigElementByTraverse(){
        int[] arr = {40,50,60,70,10};
        int temp=0;
        int big = arr[4];
        for(int i=0 ; i< arr.length ; i++){
            if(big < arr[i]) {
                big = arr[i];
            }
        }
        System.out.println(big);


    }
    public  static void bigElementByStream() {
        int[] arr = {40, 50, 60, 70, 10};

        System.out.println( Arrays.stream(arr).max().getAsInt());

    }
    public static void main(String[] args){
     //   bigElement();
       //  bigElementByTraverse();
       //  bigElementBySort();
        secondLargest();
    }


    public static void secondLargest(){
        int[] arr = {1,200,3,50,400,20};
        for(int i = 0 ; i<2 ; i++) {
            for (int j = 0; j< arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int a : arr){
            System.out.println(a);
        }
    }
}
