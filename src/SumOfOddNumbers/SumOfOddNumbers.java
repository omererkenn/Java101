package SumOfOddNumbers;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number:");
            int number = input.nextInt();
            if (number % 2 == 0 || number % 4 == 0) {
                total += number;
            }
            if (number % 2 != 0) {
                break;
            }
        }

        System.out.println("Total number :" + total);
    }
}
