import java.util.Arrays;

public class ArrayCreationExample {
    public static void main(String[] args) {
        // Using Array Initializer
        int[] numbers1 = {1, 2, 3, 4, 5};

        // Using the new Keyword
        int[] numbers2 = new int[5];

        // Initializing with Default Values
        int[] numbers3 = new int[5];

        // Using a Loop for Initialization
        int[] numbers4 = new int[5];
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = i + 1;
        }

        // Using Array Constructor
        int[] numbers5 = new int[]{1, 2, 3, 4, 5};

        // Using the Arrays Class to Fill
        int[] numbers6 = new int[5];
        Arrays.fill(numbers6, 42);

        // Print the arrays
        System.out.println("numbers1: " + Arrays.toString(numbers1));
        System.out.println("numbers2: " + Arrays.toString(numbers2));
        System.out.println("numbers3: " + Arrays.toString(numbers3));
        System.out.println("numbers4: " + Arrays.toString(numbers4));
        System.out.println("numbers5: " + Arrays.toString(numbers5));
        System.out.println("numbers6: " + Arrays.toString(numbers6));
    }
}
