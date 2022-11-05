package ChinaZodiac;

import java.util.Scanner;

public class ChineseZodiac {
    private static int remainder;

    public static void main(String[] args) {
        //Variables
        int bornYear;
        //User info
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you born year:");
        bornYear = input.nextInt();
        int remainder = bornYear % 12;
        //Call method
        System.out.println("Chineese Zodiac:" + zodiac(remainder));

    }

    public static String zodiac(int number) {
        //Two room String array
        String[][] chineseZodiac = {
                {"Monkey", "Cockerel", "Dog", "Pork", "Mouse", "Bullock", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"}, {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}
        };
        return chineseZodiac[0][number];
    }
}
