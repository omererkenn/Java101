package RecursiveExpo;

import java.util.Scanner;

public class RecursiveExpo {
    public static void main(String[] args) {
        /**
         * Enter numbers
         */
        int base, expo;
        Scanner input = new Scanner(System.in);
        System.out.println("Base number:");
        base = input.nextInt();
        System.out.println("Expo number:");
        expo = input.nextInt();
        System.out.println("Result:"+findExpoNumber(base , expo));

    }

    static double findExpoNumber(int base, int expo) {
        int count = expo;
        if (count != 0) {
            count--;
            double result = base * findExpoNumber(base, count);
            return  result;
        }else {
            return 1;
        }
    }
}
