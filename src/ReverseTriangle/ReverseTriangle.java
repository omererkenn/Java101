package ReverseTriangle;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        /**
         * Enter the step numbers
         */
        int step;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the step :");
        step = input.nextInt();

        for (int h = step; h >= 1; h--) {
            for (int b = 1; b <= step - (h-1); b++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= (2 * h) - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
