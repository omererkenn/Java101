package Factoriel;

import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("First Numbers:");
        firstNumber = input.nextInt();
        System.out.println("Second Numbers:");
        secondNumber = input.nextInt();

        System.out.println("Combination :" + factorielCalculate(firstNumber) / (factorielCalculate(secondNumber) * (factorielCalculate(firstNumber - secondNumber))));


    }

    public static int factorielCalculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
