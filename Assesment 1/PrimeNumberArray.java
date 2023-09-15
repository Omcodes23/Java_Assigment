import java.util.ArrayList;
import java.util.Arrays;
public class PrimeNumberArray {
	public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] primeArray = findPrimeNumbers(inputArray);
		System.out.println("Input Array: "+" --> "+ Arrays.toString(inputArray)+" <-- ");
        System.out.println("Prime Numbers Array: "+" --> "+ Arrays.toString(primeArray)+" <-- ");
    }
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
	public static int[] findPrimeNumbers(int[] inputArray) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int num : inputArray) {
            if (isPrime(num)) {
                primeList.add(num);
            }
        }
		int[] primeArray = new int[primeList.size()];
        for (int i = 0; i < primeList.size(); i++) {
            primeArray[i] = primeList.get(i);
        }
		return primeArray;
    }
}
