package ExcellentNumber;

import java.util.Scanner;

public class ExcellentNumber {
    public static void main(String[] args) {
        /**
         * we will find excellent or not excellent the number
         */
        int number, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        number = input.nextInt();

        /**
         * Finding numbers that are positively divided by the entered number
         */
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        /**
         * is it number excellent or not excellent?
         */
        if(number == total){
            System.out.println("This number perfect");
        }else {
            System.out.println("This number not perfect");
        }
    }
}
