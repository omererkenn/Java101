package LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Variables
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:");
        year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " is a leap number");
        } else if (year > 100 && year % 400 == 0) {
            System.out.println(year + " is a leap number");
        } else {
            System.out.println(year + " is not a leap number");
        }

    }
}
