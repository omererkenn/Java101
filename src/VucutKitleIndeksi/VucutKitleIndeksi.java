package VucutKitleIndeksi;

import java.util.Scanner;
import java.util.function.BiFunction;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Boy:");
        boy = input.nextDouble();
        System.out.println("Kilo:");
        kilo = input.nextDouble();
        BiFunction<Double, Double, Double> kitleIndeksi = (k, b) -> k / Math.pow(b, 2);
        System.out.println("Kitle İndeksi : " + kitleIndeksi.apply(kilo, boy));
    }
}
