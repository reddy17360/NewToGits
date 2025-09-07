package JavaProg.InterviewPrograms;

public class FibSeries { //fibseries are sequence of the numbers where each number is the sum of two preceding numbers

    public static void main(String[] sanju){
        Fseries(5 , 0,1);
    }
 public static void Fseries( int n ,int a , int b){
        int temp =0;
     System.out.println(a );
     System.out.println(b);
        for(int i=1;i<=10; i++){
            if((a+b) <=10) {
                temp = a + b;
                a = b;
                b = temp;
                System.out.println(temp);
            }

        }


 }

}
