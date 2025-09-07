package JavaConcepts.Arrays.Programs;

import java.util.Scanner;

public class SearchingElementArray {
    public static void main(String args[]){

        int[] arr ={100,300,400,35,90};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search here");
        int x = scanner.nextInt();

        for(int i=0;i<arr.length;i++){
            if(x==arr[i])
                System.out.println("your element at " + i);
            else
                System.out.println("Not found");
        }
    }
}
