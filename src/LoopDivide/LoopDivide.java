package LoopDivide;

import java.util.Scanner;

public class LoopDivide {
    public static void main(String[] args) {
        int maxValue;
        int total = 0;
        int forAverageCount = 0;
        Scanner input = new Scanner(System.in);
        maxValue = input.nextInt();


        for(int i = 0; i <= maxValue; i++){
            if(i % 3 == 0 && i % 4 == 0){
                total += i;
                System.out.println(i);
                forAverageCount++;
            }
        }

        System.out.println("Average of numbers divisible by 3 and 4 up to the entered number : " + total / (forAverageCount -1));
    }
}
