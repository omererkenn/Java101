package Horoscope;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        int mounth, day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mounth :");
        mounth = scanner.nextInt();
        System.out.println("Enter the day :");
        day = scanner.nextInt();
        System.out.println(horoscope(0, mounth, day));
    }


    public static String horoscope(int year, int mounth, int day) {
        LocalDate date = LocalDate.of(year, mounth, day);
        if (date.isAfter(LocalDate.of(0, 3, 21)) && date.isBefore(LocalDate.of(0, 4, 20))) {
            return "Koc";
        }
        if (date.isAfter(LocalDate.of(0, 4, 21)) && date.isBefore(LocalDate.of(0, 5, 21))) {
            return "Boğa";
        }
        if (date.isAfter(LocalDate.of(0, 5, 22)) && date.isBefore(LocalDate.of(0, 6, 22))) {
            return "İkizler";
        }
        if (date.isAfter(LocalDate.of(0, 6, 23)) && date.isBefore(LocalDate.of(0, 7, 22))) {
            return "Yengeç";
        }
        if (date.isAfter(LocalDate.of(0, 7, 23)) && date.isBefore(LocalDate.of(0, 8, 22))) {
            return "Aslan";
        }
        if (date.isAfter(LocalDate.of(0, 8, 23)) && date.isBefore(LocalDate.of(0, 9, 22))) {
            return "Başak";
        }
        if (date.isAfter(LocalDate.of(0, 9, 23)) && date.isBefore(LocalDate.of(0, 10, 22))) {
            return "Terazi";
        }
        if (date.isAfter(LocalDate.of(0, 10, 23)) && date.isBefore(LocalDate.of(0, 11, 21))) {
            return "Akrep";
        }
        if (date.isAfter(LocalDate.of(0, 11, 22)) && date.isBefore(LocalDate.of(0, 12, 21))) {
            return "Yay";
        }
        if (date.isAfter(LocalDate.of(0, 12, 22)) && date.isBefore(LocalDate.of(0, 1, 21))) {
            return "Oğlak";
        }
        if (date.isAfter(LocalDate.of(0, 1, 22)) && date.isBefore(LocalDate.of(0, 2, 19))) {
            return "Kova";
        }
        if (date.isAfter(LocalDate.of(0, 2, 20)) && date.isBefore(LocalDate.of(0, 3, 20))) {
            return "Balık";
        }
        return null;

    }
}
