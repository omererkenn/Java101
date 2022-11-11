package DigitPlus;

import java.util.Scanner;

public class DigitPlus {
    public static void main(String[] args) {
        String number;
        int total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        number = input.nextLine();


        for (int i = 0; i<number.length(); i++){
            total += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        System.out.println("Result:"+total);

    }
}
