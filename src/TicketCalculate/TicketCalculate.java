package TicketCalculate;

import java.util.Scanner;

public class TicketCalculate {
    public static void main(String[] args) {
        //Variables
        int km, age, travelType;
        double perKm = 0.10;
        /**
         * Customer info
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance(km):");
        km = input.nextInt();
        System.out.println("Enter the age:");
        age = input.nextInt();
        System.out.println("Enter the travel type: 1 ==> One Way , 2 ==> Round Trip");
        travelType = input.nextInt();
        System.out.println("Total:" + ticketCalculate(km, age, travelType, perKm));

    }

    /**
     * Ticket calculate method
     * @param km
     * @param age
     * @param travelType
     * @param perKm
     * @return
     */
    public static double ticketCalculate(int km, int age, int travelType, double perKm) {
        if (km < 0 || age < 0 || travelType < 1 || travelType > 2) {
            System.out.println("You entered wrog data");
        } else {
            double result = km * perKm;
            if (age < 12) {
                result = result - (result * 50 / 100);
            }
            if (age >= 12 && age <= 24) {
                result = result - (result * 10 / 100);
            }
            if (age > 65) {
                result = result - (result * 30 / 100);
            }
            if (travelType == 2) {
                result = result - (result * 20 / 100);
            }
            return result;
        }
        return 0;
    }
}
