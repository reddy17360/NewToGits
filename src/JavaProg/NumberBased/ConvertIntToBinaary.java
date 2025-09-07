package JavaProg.NumberBased;

public class ConvertIntToBinaary{

    public static void main(String[] sanju){

       // intToBinary(15);
    ///   binaryToInt(11);
   // int n=0b1000;
      //  System.out.println(n);
         usingPow("1000");
       // int x = 10;
       // int y=(int)  10.6;
       // System.out.println(y);
       // System.out.println(0b100000);
    }
    public static  void intToBinary(int n){
        int rem =0 ;
        while(n>0){
          rem  =  n % 2 ;
          System.out.println(rem);
          n = n / 2 ;
        }

    }
    public static void binaryToInt(int n){


        int decimalVal=0;
        int base =1 ;
        while(n>0){
            int rem = n % 2;
            n = n / 10 ;
            decimalVal = decimalVal + rem * base ;
            base = base * 2 ;
        }
        System.out.println(decimalVal);

    }
    public static void usingPow(String binary){
//100
        int power = 0 ;
       int result = 0 ;
        for(int i = binary.length()-1 ; i >=0 ; i--){
            if(binary.charAt(i)=='1') {
                result += Math.pow(2, power);
            }
            power++;
        }

        System.out.println(result);
    }
}
