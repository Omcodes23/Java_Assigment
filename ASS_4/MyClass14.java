class MyClass14 {
    static String college = "ABC College"; // Static variable

    static void changeCollege(String newCollege) {
        college = newCollege; // Change the value of the static variable
    }

    public static void main(String[] args) {
        System.out.println("Original College: " + college);

        changeCollege("XYZ University");
        System.out.println("Modified College: " + college);
    }
}
