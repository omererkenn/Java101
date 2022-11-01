package Hipotenus;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner value = new Scanner(System.in);
        System.out.println("A kenarı :");
        a = value.nextInt();
        System.out.println("B kenarı :");
        b = value.nextInt();


        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hipotenüs:" + c);
    }
}
