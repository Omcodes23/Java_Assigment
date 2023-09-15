public class ten {
    public static void main(String[] args) {
        int num = 2;
        int pow = 10;
        
        int i;
        int poww = 1;

        for(i=0 ; i<pow ; i++){
            poww = poww * num;
        }
        System.out.println("2 to the power of 10 = " + poww);
    }
}
