package Calculator;

import java.util.Scanner;

public class Calculator {
    static double plus(int a, int b) {
        double plus = a + b;
        System.out.print("Result : ");
        return plus;
    }

    static double minus(int a, int b) {
        double minus = a - b;
        System.out.print("Result : ");
        return minus;
    }

    static double multiplication(int a, int b) {
        double multiplacation = a * b;
        System.out.print("Result : ");
        return multiplacation;
    }

    static double divided(int a, int b) {
        double divided = a / b;
        System.out.print("Result : ");
        return divided;
    }

    static double exponential(int a, int b) {
        double expo = Math.pow(a, b);
        return expo;
    }

    static void rectangle(int a, int b) {
        double env = (a + b) * 2;
        double area = (a * b);

        System.out.println("Area : " + area + "\nEnv : " + env);
    }

    static void modding(int a, int b) {
        int result = a % b;

        System.out.println("Result : " + result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu = "1-Plus\n"
                + "2-Minus\n"
                + "3-Multiplacation\n"
                + "4-Divided\n"
                + "5-Exponential Number\n"
                + "6-Rectangle Area ve Env Calculate\n"
                + "7-Modding\n"
                + "0-Logout";

        do {
            System.out.println(menu);
            System.out.println("---------------");
            System.out.print("Please your choose :");
            select = scanner.nextInt();

            if (select == 0) {
                System.out.println("Logging out.");
                return;
            }
            System.out.print("Enter first number : ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter second number : ");
            int secondNumber = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println(plus(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println(minus(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println(multiplication(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.println(divided(firstNumber, secondNumber));
                    break;
                case 5:
                    System.out.println(exponential(firstNumber, secondNumber));
                    break;
                case 6:
                    rectangle(firstNumber, secondNumber);
                    break;

                case 7:
                    modding(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("You make wrong choose.Please try again.");
            }
        } while (select != 0);

    }
}
