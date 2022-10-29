package KdvTutari;

import java.util.Scanner;

public class KdvTutarHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı giriniz :");
        int tutar = input.nextInt();

        double toplamKdv = (tutar > 1000) ? tutar * 1.18 : tutar * 1.08;

        System.out.println("Tutar : " + tutar);
        System.out.println("Kdv'li Fiyat : " + toplamKdv);
        System.out.println("Kdv tutarı : " + (toplamKdv - tutar));
    }
}
