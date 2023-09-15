import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        Calendar calendar = new GregorianCalendar(year, month - 1, 1);

        String monthName = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int dayOfWeek = Calendar.SUNDAY;

        for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) {
            System.out.print("    ");
            dayOfWeek++;
        }

        for (int day = 1; day <= numberOfDaysInMonth; day++) {

            System.out.printf("%3d ", day);
            dayOfWeek++;

            if (dayOfWeek == Calendar.SATURDAY) {
                System.out.println();
                dayOfWeek = Calendar.SUNDAY;
            }
        }

        System.out.println();

        scanner.close();
    }
}
