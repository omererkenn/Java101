package Proposal;

import java.util.Scanner;

public class Proposal {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the air temperature");
        temperature = input.nextInt();
        System.out.println(proposal(temperature));
    }


    public static String proposal(int temperature) {
        if (temperature < 5) {
            return "you can do ski";
        } else if (temperature <= 15) {
            return "You can go to the cinema";
        } else if (temperature <= 25) {
            return "You can go to the picnic";
        } else if (temperature > 25) {
            return "You can do swimming";
        }
        return null;
    }
}
