package Palindrom;

public class Palindrom {
    static boolean checkPalindrom(int number) {
        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        if (number == reverseNumber) {
            System.out.println("Palindrom number");
        } else {
            System.out.println("Not palindrom number.");
        }
        return true;
    }

    public static void main(String[] args) {
        checkPalindrom(101);

    }
}
