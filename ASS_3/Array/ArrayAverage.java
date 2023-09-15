public class ArrayAverage {
    public static void main(String[] args) {
        double[] numbers = { 5.0, 10.0, 15.0, 20.0, 25.0 };
        
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        
        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
