package FindFibo;

import java.util.Scanner;

public class FindFibo {
    public static void main(String[] args) {
        /**
         * find fibonacci up to this number
         */
        int number;
        int a = 0, b = 1, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = input.nextInt();

        for (int i = 0; i < number; ++i) {
            c = a + b;
            System.out.println(a + " + " + b + " =" + c);
            a = b;
            b = c;
        }
    }
}
