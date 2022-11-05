package Average;

import java.util.Scanner;
import java.util.function.Predicate;

public class Average {
    public static void main(String[] args) {
        int mat, physics, turkish, chemical, music;
        double average = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Mat score:");
        mat = input.nextInt();
        System.out.println("Physics score:");
        physics = input.nextInt();
        System.out.println("Turkish score:");
        turkish = input.nextInt();
        System.out.println("Chemical score:");
        chemical = input.nextInt();
        System.out.println("Music score:");
        music = input.nextInt();

        int[] scoreList = new int[5];
        scoreList = new int[]{mat, physics, turkish, chemical, music};
        for (Integer point : scoreList) {
            if (point <= 100 && point >= 0) {
                average += point;
            }
        }
        average = average / scoreList.length;
        System.out.println("Average:" + average);
        if (average >= 55) {
            System.out.println("Successfull");
        } else {
            System.out.println("Failed");
        }


    }


}
