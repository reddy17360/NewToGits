package JavaProg.ArrayPrograms;

public class InsertionAtTheBegining {

    void insertionOfElementToTheBegining(int newVal){
        int arr[] = {1,2,3,4,9};
                arr[0]=newVal;
//        for(int i= arr.length-2; i>=0 ; i--){
//           arr[i+1] =arr[i];
//           if(i==0){
//               arr[0] =  newVal;
//           }
//        }

       for(int j : arr){
           System.out.println(j);
       }

    }

    public static void main(String[] sanju){
        InsertionAtTheBegining insertionAtTheBegining= new  InsertionAtTheBegining();

        insertionAtTheBegining.insertionOfElementToTheBegining(10);
    }
}
