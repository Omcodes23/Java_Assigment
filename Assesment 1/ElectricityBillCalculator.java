import java.util.Scanner;
public class ElectricityBillCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Consumer No.: ");
        String consumerNo = scanner.nextLine();
		System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();
		System.out.print("Enter Previous Month's Reading: ");
        int previousReading = scanner.nextInt();
		System.out.print("Enter Current Month's Reading: ");
        int currentReading = scanner.nextInt();
		int unitsConsumed = currentReading - previousReading;
		double amount = calcElectricityBill(unitsConsumed);
		System.out.println("\nElectricity Bill Details:");
        System.out.println("Consumer No.\tName\tUnits Consumed\tAmount");
        System.out.println(consumerNo + "\t\t" + consumerName + "\t" + unitsConsumed + "\t\t"+""+ amount);
		scanner.close();
    }
	public static double calcElectricityBill(int unitsConsumed) {
        double amount = 0;
		if (unitsConsumed <= 100) {
            amount = unitsConsumed * 1.25;
        } else if (unitsConsumed <= 200) {
            amount = 100 * 1.25 + (unitsConsumed - 100) * 1.50;
        } else {
            amount = 100 * 1.25 + 100 * 1.50 + (unitsConsumed - 200) * 1.80;
        }
		return amount;
    }
}
