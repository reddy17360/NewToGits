package JavaConcepts.Arrays.Programs;

public class DuplicateVal {
    public static void main(String[] nju){

        findDuplicateArrayVal();
    }



    static void findDuplicateArrayVal(){
    int[] arr = {10,20,10,30,40,50,};
    int repeat=0;

    for(int i=0; i<arr.length ; i++){
        for(int j=i ; j<arr.length-1 ; j++){
            if(arr[i] == arr[j+1]){
                repeat++;
            }
        }
    }

    }
}
