package HesapMakinesi;

import java.util.Scanner;

public class CalculateMachine {
    public static void main(String[] args) {
        double firstNumber, secondNumber;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.println("First input number:");
        firstNumber = input.nextDouble();
        System.out.println("Second input number:");
        secondNumber = input.nextDouble();
        /**
         * Calculate type select
         */
        System.out.println("1-plus\n2-minus\n3-multiplication\n4-divide");
        System.out.println("Choose : ");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("result : " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("result : " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("result : " + (firstNumber * secondNumber));
                break;
            case 4:
                if (secondNumber == 0) {
                    System.out.println("A number cannot be divided by zero");
                    break;
                }
                System.out.println("result : " + (firstNumber / secondNumber));
            default:
                System.out.println("You made the wrong choice");
        }

    }
}
