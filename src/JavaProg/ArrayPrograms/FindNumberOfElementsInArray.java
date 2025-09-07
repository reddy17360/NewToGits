package JavaProg.ArrayPrograms;

import java.util.Scanner;

public class FindNumberOfElementsInArray {
    public   void NumOfElements(int[] arr){
        System.out.println(arr.length + " Elements are available in the given array");
    }
    public void largetInGiveArray(int[] arr){
        int max=arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i] > max)
                 max=arr[i];
         }
        System.out.println("Largest elements in the give array is " + max);
    }

    public void sortArray(int arr[]){
        for(int i=0;i<arr.length;i++){ //1,2,3,4
            for (int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        for(int x : arr){
            System.out.println(x);
        }
        for(int i=arr.length-1;i>= arr.length-2;i--){
            if(i==arr.length-1)
            System.out.println("First largest elements in the array " + arr[i]);
            else
                System.out.println("Second largest elements in the array " + arr[i]);
        }
    }
    public void minimunDistanceBwTwoElements(){

        int arrr [] = {1,2,3,4,5,6,7};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int xx=0;
        int yy=0;
        for(int i=0;i<arrr.length;i++){
            if(arrr[i]==x){
                xx=i;
            }
            if(arrr[i]==y)
            {
                yy=i;
            }

        }
        System.out.println(xx+yy-2 + "is the distance betweeen" + x + "&&" + y);
    }
    public static void main(String args[]){
        int arr[] = {1,20,3,4,5};
        FindNumberOfElementsInArray findNumberOfElementsInArray=new FindNumberOfElementsInArray();
//        findNumberOfElementsInArray.NumOfElements(arr);
//
//         findNumberOfElementsInArray.largetInGiveArray(arr);

        /// findNumberOfElementsInArray.sortArray(arr);
        findNumberOfElementsInArray.minimunDistanceBwTwoElements();
    }

}
