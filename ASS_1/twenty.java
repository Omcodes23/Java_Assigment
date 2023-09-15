public class twenty {
    
    public static void main(String[] args) {
        
        int num1 = 2;
        int num2 = 88;
        int num3 = 9;

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1+ " is greater.");
        }
        else if (num2 >= num1 && num2 >= num3 ){
            System.out.println(num2+ " is greater.");
        }
        else{
            System.out.println(num3+ " is greater.");
        }
        if (num1 <= num2 && num1 <= num3){
            System.out.println(num1+ " is least.");
        }
        else if (num2 <= num1 && num2 <= num3){
            System.out.println(num2+ " is least.");
        }
        else {
            System.out.println(num3+ " is least.");
        }
    }
}
