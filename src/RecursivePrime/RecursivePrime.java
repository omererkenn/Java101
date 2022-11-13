package RecursivePrime;

import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        /**
         * Entered the number
         */
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        number = input.nextInt();
        System.out.println(recursivePrime(number, 2));

    }

    static String recursivePrime(int number, int divide) {
        boolean status = false;
        if (number == 2) {
            return "Prime Number";
        }
        if (number % divide == 0 && divide < number) {
            status = true;
            return "Not Prime";
        }
        if (divide < number) {
            return recursivePrime(number, divide + 1);
        } else if (!status) {
            return "Prime Number";
        }
        return null;
    }
}
