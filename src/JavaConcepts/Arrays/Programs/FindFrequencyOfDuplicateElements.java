package JavaConcepts.Arrays.Programs;

public class FindFrequencyOfDuplicateElements {
    public static void main(String[] args) {
        int i, j, frequency;
        int array[] = {1, 1,2, 1, 2, 1};
        int fre[] = new int[array.length];
        int visited=-1;
        for (i = 0; i < array.length-1; i++) { //to select the element from the array
            int count=1;
            for (j = i+1; j <array.length-1; j++) { //to check the selected element with rest of the array
                if (array[i] == array[j]) {
                    count++;
                    fre[j] = visited;
                }


            }
            if(fre[i]!=visited){
                 fre[j]=count;
            }



        }
for(int ii=0;ii<=array.length;ii++){
    System.out.println(array[i] + "  " + fre[i]);

}
    }
}


