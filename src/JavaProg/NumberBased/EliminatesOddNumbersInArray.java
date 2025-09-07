package JavaProg.NumberBased;

import java.util.ArrayList;

public class EliminatesOddNumbersInArray {
    public static void main(String[] sanju){
        int arr[] ={1,2,3,4,5,6,7,8,99,88};
        eliminateOdd(arr);
        eliminateEven(arr);
    }
    static void eliminateOdd(int arr[]){
        ArrayList temp = new ArrayList(4);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0)
                temp.add(arr[i]);
        }
        System.out.println(temp);
    }
    static void eliminateEven(int arr[]){
        ArrayList temp = new ArrayList(4);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0)
                temp.add(arr[i]);
        }
        System.out.println(temp);
    }
}
