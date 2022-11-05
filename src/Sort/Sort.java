package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        int firsNumber, secondNumber, threeNumber;
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Firs Number :");
        firsNumber = input.nextInt();
        System.out.println("Second Number :");
        secondNumber = input.nextInt();
        System.out.println("Three Number :");
        threeNumber = input.nextInt();

        numbers.add(firsNumber);
        numbers.add(secondNumber);
        numbers.add(threeNumber);

        Collections.sort(numbers);
        System.out.println("Sort:" + numbers);

    }
}
