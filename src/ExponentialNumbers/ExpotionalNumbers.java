package ExponentialNumbers;

import java.util.Scanner;

public class ExpotionalNumbers {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        number = input.nextInt();


        for (int i = 1; i <= number; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 1; i <= number; i *= 5) {
            System.out.print(i + " ");
        }

    }
}
