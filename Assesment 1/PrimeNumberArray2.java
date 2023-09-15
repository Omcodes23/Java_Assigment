import java.util.ArrayList;
import java.util.Scanner;
public class PrimeNumberArray2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
		int[] inputArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
		int[] primeArray = findPrimeNumbers(inputArray);
		System.out.println("Input Array: ");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
		System.out.println("\nPrime Numbers Array: ");
        for (int prime : primeArray) {
            System.out.print(prime + " ");
        }
		scanner.close();
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
