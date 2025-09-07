package JavaProg.NumberBased;

public class PrimeNumbers {
    public static void main(String[] args) {

        PrimeNumbers.isPrime(10);

    }

    public static void isPrime(int j) {

        boolean prime = true;
        for (int n = 2; n <= j; n++) {

            for (int i = 2; i <= (n / 2); i++) {
                if (n % i == 0) {
                    prime = false;
                } else
                    prime = true;
            }
            if (prime)
                System.out.println(n);


        }
    }
}


