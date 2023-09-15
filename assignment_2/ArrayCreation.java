import java.util.Arrays;

public class ArrayCreation {

    public static void main(String[] args) {
        // Create an array of 10 integers.
        int[] intArray = new int[10];

        // Create an array of 5 floats.
        float[] floatArray = new float[5];

        // Create an array of 8 doubles.
        double[] doubleArray = new double[8];

        // Create an array of 4 shorts.
        short[] shortArray = new short[4];

        // Create an array of 5 bytes.
        byte[] byteArray = new byte[5];

        // Print the sizes of the arrays.
        System.out.println("The size of the intArray is " + intArray.length);
        System.out.println("The size of the floatArray is " + floatArray.length);
        System.out.println("The size of the doubleArray is " + doubleArray.length);
        System.out.println("The size of the shortArray is " + shortArray.length);
        System.out.println("The size of the byteArray is " + byteArray.length);
    }
}