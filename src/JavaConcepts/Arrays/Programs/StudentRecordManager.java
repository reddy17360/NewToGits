package JavaConcepts.Arrays.Programs;

public class StudentRecordManager {
    public static void main(String[] args){
        String[] names={"Sanju" , "Manju" , "Shankar" , "Ravi" , "Ganesh"};
        int[] marks={90 ,98 , 79,47,99};
         StudentRecordManager.sortBro(names , marks);
        System.out.println("10th Students result");
         for(int i=0;i<marks.length;i++){
             System.out.println(names[i] + "'s marks are " + marks[i]);
         }
    }
    public static void sortBro(String[] names , int[] marks){

        for(int i=0 ; i<marks.length-1 ; i++){
            for(int j=0 ; j<marks.length-1; j++){
                if(marks[j] < marks[j+1]){
                    int temp = marks[j+1];
                    marks[j+1]=marks[j];
                    marks[j] =temp;
                    //swaping names based on marks
                    String temps = names[j+1];
                    names[j+1]=names[j];
                    names[j] =temps;

                }
            }
        }

    }
}
