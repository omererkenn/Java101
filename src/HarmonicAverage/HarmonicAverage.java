package HarmonicAverage;

public class HarmonicAverage {
    public static void main(String[] args) {
        double[] numbers = {10, 16, 42, 13};
        double total = 0;
        for (Double number : numbers){
            total += (1 / number);
        }
        double average = total / numbers.length;
        System.out.println(average);
    }

}
