package JavaProg.InterviewPrograms;

public class PrimeNumberss {
    //a number which divisible by 1 and iteself
    public static void main(String[] sanju) {
        for(int i=2 ; i<=10;i++)
      isPrimes(i);
      // listOfPrimeNumbers(10);
    }

    static void isPrimes(int n) {
        boolean prime=false;
            for (int x = 2; x <n / 2; x++) {
                if (n % x != 0) {
                    prime = true;
                    break;
                }
                else
                    prime = false;
            }
            if(prime)
                System.out.println("I'm prime " + n);
            else
                System.out.println("Not a prime" + n);
        }

     static  void listOfPrimeNumbers(int n) {
         boolean prime = false;
         for (int i = 2; i <= n; i++) {
             for (int x = 2; x <= i/2; x++) {
                 if (x % i == 0 ) {
                     prime = false;
                     break;
                 }
                 else
                     prime = true;
             }

             if (prime)
                 System.out.println("I'm prime " + i  );
             else
                 System.out.println("Not a prime" + i );
         }
    }

     }



