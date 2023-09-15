public class six {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println("Before swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
