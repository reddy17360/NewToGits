package JavaConcepts.Arrays.Programs;

import java.util.Scanner;

public class DeletionOfSelectedElement {
    public static void main(String args[]){
        int [] arr={1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to delete");
        int x = scanner.nextInt();

        int loc=0;
        for(int i=0;i< arr.length ; i++){
            if(x==arr[i]){
                loc=i;
            }
        }
        for(int i=loc;i< arr.length ; i++) {
               arr[loc] = arr[i];
        }

        for(int i=0;i< arr.length-1 ; i++)
            System.out.println(arr[i]);
    }
}
