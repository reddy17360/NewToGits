package JavaConcepts.Arrays.Programs;

public class SortArray {
    public static void main(String[] sanju){
        int[] arr = {10,2,-1 ,  30,405 , 50 };
        SortArray sortArray = new SortArray();
        sortArray.descendingOrder(arr);
        sortArray.ascendingOrder(arr);

    }
    void ascendingOrder(int[] a){
        for(int j=0;j<a.length;j++) { // outer iteration length * length
            for (int i = 0; i < a.length - 1; i++) { //it will go check each element
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println("Areike Krama : ");
        byte  bb = 0b1111110;


        System.out.println(bb);
        for(int x : a)
            System.out.println(x + "\t" + 1%5);

    }

    void descendingOrder(int[] a){
        for(int j=0;j<a.length;j++) { // outer iteration length * length
            for (int i = 0; i < a.length - 1; i++) { //it will go check each element
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println("elike Krama :  " );
        for(int x : a)
            System.out.println(x + "\t");


    }
}
