package EbobEkok;

import java.util.Scanner;

public class EbokEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first number :");
        int firstNumber = inp.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = inp.nextInt();
        int ebob = 1;
        int i = 1;
        while (i <= firstNumber && i <= secondNumber) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB :" + ebob);

        int ekok = 1;
        int k = firstNumber;
        while (k <= firstNumber * secondNumber) {
            if (k % firstNumber == 0 && k % secondNumber == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("EKOK:" + ekok);
    }

}
