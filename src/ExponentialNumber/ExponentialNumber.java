package ExponentialNumber;

import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        int firstNumber , secondNumber , result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("First Number:");
        firstNumber = input.nextInt();
        System.out.println("Second Number:");
        secondNumber = input.nextInt();

        for(int i = 1; i<=secondNumber; i++){
            result *= firstNumber;
        }

        System.out.println("Result :"+result);
    }
}
