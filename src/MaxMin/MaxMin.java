package MaxMin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(213,412,23,12);
        int min = Collections.min(numberList);
        int max = Collections.max(numberList);
        System.out.println("min:" + min + "max :" + max);
    }
}
