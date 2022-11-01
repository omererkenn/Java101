package DaireAlanVeÇevreHesapla;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DaireAlanVeÇevreHesapla {
    public static void main(String[] args) {
        double pi = 3.14;
        Function<Integer , Double> alanHesapla = yaricap -> Math.pow(yaricap , 2) * pi;
        Function<Integer , Double> cevreHesapla = yaricap -> 2 * pi *yaricap;
        BiFunction<Integer, Integer ,Double> daireDilimAlan = (yaricap , aci) -> pi * Math.pow(yaricap , 2) * aci / 360;




        int yariCap;
        int aci;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap Giriniz:");
        yariCap = input.nextInt();
        System.out.println("Açı Giriniz:");
        aci = input.nextInt();
        System.out.println("Alan :" + alanHesapla.apply(yariCap));
        System.out.println("Çevre :" + cevreHesapla.apply(yariCap));
        System.out.println("Daire Alan :" + daireDilimAlan.apply(yariCap , aci));


    }

}
