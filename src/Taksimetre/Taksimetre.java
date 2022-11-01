package Taksimetre;

import java.util.Scanner;
import java.util.function.Function;

public class Taksimetre {


    public static void main(String[] args) {

        Function<Double, Double> kmCalculate = km -> (km * 2.20 + 10) > 20 ? (km * 2.20 + 10) : 20;

        double km;
        Scanner inputKm = new Scanner(System.in);
        System.out.println("KM Giriniz:");
        km = inputKm.nextDouble();
        System.out.println(kmCalculate.apply(km));
    }
}
