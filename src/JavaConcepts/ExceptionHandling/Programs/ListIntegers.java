package JavaConcepts.ExceptionHandling.Programs;
import java.util.Scanner;
public class ListIntegers
{
        public static void main(String[] args){
            dum();
        }
        public static void dum(){
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[4];
            for(int i=0;i<4;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<arr.length ; i++){
                for(int j=0;i<arr.length ; j++){
                    if(arr[i]==arr[j])
                        throw new OddNumberException("Duplicate number");
                }

            }
        }
}
    class OddNumberException extends RuntimeException{
        OddNumberException(String s){
            super(s);
        }
    }

