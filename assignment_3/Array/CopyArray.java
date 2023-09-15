public class CopyArray {
    public static void main(String[] args) {
        int[] sourceArray = { 5, 10, 15, 20, 25 };
        int[] destinationArray = new int[sourceArray.length];
        
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        
        System.out.println("Source Array:");
        for (int number : sourceArray) {
            System.out.print(number + " ");
        }
        
        System.out.println("\nDestination Array:");
        for (int number : destinationArray) {
            System.out.print(number + " ");
        }
    }
}
