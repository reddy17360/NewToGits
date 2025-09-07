package JavaConcepts.Arrays.Programs;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] x = {100, 20, 90, 40, 60};

        int temp = 0;
        //for(int i=0; i<x.length ; i++) {
        for (int j = 0; j < x.length - 1; j++) {
            if (x[j] > x[j + 1]) {
                temp = x[j];
                x[j] = x[j + 1];
                x[j + 1] = temp;

            }
        }
        //}
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static void bigElementBySort() {

        int[] arr = {40, 50, 60, 70, 10};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.println(arr[i]);
    }
}

