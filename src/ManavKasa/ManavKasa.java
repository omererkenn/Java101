package ManavKasa;

import java.util.List;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kg :");
        armut = input.nextDouble() * 2.14;
        System.out.println("Elma Kg :");
        elma = input.nextDouble() * 3.67;
        System.out.println("Domates Kg :");
        domates = input.nextDouble() * 1.11;
        System.out.println("Muz Kg :");
        muz = input.nextDouble() * 0.95;
        System.out.println("Patlıcan Kg :");
        patlican = input.nextDouble() * 5;
        tutar = armut + elma + domates + muz + patlican;
        System.out.println("Tutar:" + tutar);

    }
}
