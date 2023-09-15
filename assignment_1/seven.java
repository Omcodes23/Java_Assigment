public class seven {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println("Before swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
