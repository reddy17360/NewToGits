package JavaProg2;

public class FindMaxInArray {

    public static void main(String[] args){
        int[] arr={1,3,4,5,6,10,9};//array is an index based fixed number of homogeneous elements
        //we assume any element in the array as max one
        int max=arr[0];
        //now i have to compare this with all the other values present in array
        for(int i=0;i<arr.length;i++){
            if(max > arr[i] ){//comparing the values
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }

        }
        System.out.println(max + "maximun sound");
    }
}
