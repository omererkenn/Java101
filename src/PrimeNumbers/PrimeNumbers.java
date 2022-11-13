package PrimeNumbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        /**
         * Find primes up to this number
         */
        int i = 100;
        boolean status = true;
        for (int a = 2; a < 100; a++) {
            status = true;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    status = false;
                    break;
                }
            }
            if (status) {
                System.out.println(a + " ");
            }
        }
    }
}
