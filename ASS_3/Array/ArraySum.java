public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25 };
        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);
    }
    
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
