package MinMaxNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        /**
         * User will enter the numbers
         */
        int numberCount;
        List<Integer> numberList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers:");
        numberCount = input.nextInt();
        for (int i = 1; i <= numberCount; i++) {
            System.out.println("Enter the number:");
            int number = input.nextInt();
            numberList.add(number);
        }

        /**
         * Collections library use min and max find value
         */
        System.out.println("Min :" + Collections.min(numberList) + " Max:" + Collections.max(numberList));

    }
}
