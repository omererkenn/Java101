package RecursiveDesene;

import java.util.Scanner;

public class RecursiveDesene {
    public static void main(String[] args) {
        /**
         * Enter the number
         */
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        number = input.nextInt();
        int firstNumber = number;
        recursiveMethod(number, firstNumber, true);

    }

    static int recursiveMethod(int number, int firstNumber, boolean status) {
        int first = firstNumber;
        if (number > 0 && status) {
            System.out.println(number);
            number -= 5;
            return recursiveMethod(number, first, true);
        }
        status = false;
        if (first <= number && Math.abs(first) != number) {
            System.out.println(number);
            number += 5;
            return recursiveMethod(number, first, false);
        }
        System.out.println(number);
        return 0;
    }
}
