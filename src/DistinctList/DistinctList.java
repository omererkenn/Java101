package DistinctList;

import java.util.ArrayList;
import java.util.List;

public class DistinctList {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 4, 5, 6, 7, 6, 6, 9, 9, 10, 10, 11, 12, 13,13, 14, 14,14};
        List<Integer> distinctList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((i != j) && (numbers[i] == numbers[j])) {
                    if (numbers[j] % 2 == 0) {
                        if (!(distinctList.contains(numbers[j]))) {
                            distinctList.add(numbers[j]);
                        }

                    }
                }
            }
        }
        System.out.print("Distinct: ");
        for (int distinct : distinctList) {
            System.out.print(distinct + " ");
        }
    }
}
