package Diamond;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row star for diamond:");
        int row = input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= (row - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int h = row - 1; h >= 1; h--) {
            for (int b = 1; b<=row - h; b++) {
                System.out.print(" ");
            }

            for(int n= 1; n<=(2*h) -1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

