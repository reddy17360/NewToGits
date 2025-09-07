package JavaProg.NumberBased;

public class WarOfNum {
    public static void main(String[] reddy){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        warBegins(arr);
    }
   static void warBegins(int arr[]){
        int odd =0 , even=0;
        for(int i=0;i<arr.length;i++){
            if( i % 2 == 0)
                even = even + i ;
            else
                odd = odd + i ;
        }
        if(odd > even){
            System.out.println("Odd number is won the war.... victiroous ");
        }
        else
            System.out.println("EVen number won the war");
    }
}
