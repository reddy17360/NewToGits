package JavaProg.InterviewPrograms;

public class LargestNumInTheArray {

    public static void main(String[] args){
        int arr[] = {1,2,4,3,5,6,7,8};
        findLarge(arr);
    }
    public static void findLarge(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest >= arr[i])
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
