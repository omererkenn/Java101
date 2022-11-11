package HarmonicNumbers;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        int number;
        double total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        number = input.nextInt();

        for(double i = 1; i<=number; i++){
            total += (1 / i);
        }

        System.out.println("Result :" + total);
    }
}
