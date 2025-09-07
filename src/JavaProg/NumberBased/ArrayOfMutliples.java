package JavaProg.NumberBased;

public class ArrayOfMutliples {
    public static void main(String[] sanju){
        mulArray(5,7);
    }

    static void mulArray(int lenthOfArray , int numberOfVal){

        int[] arr = new int[lenthOfArray];
        for(int i=0;i<lenthOfArray;i++){
            arr[i] = numberOfVal * (i+1);
        }
        for(int a : arr){
            System.out.println(a);
        }
    }
}
