import java.util.Random;

public class UC2 {
    public static void main(String[] args) {
        System.out.println("Calculating Daily Wage: ");

        int DailyWage;
        int WagePerHour = 20;
        int FullDayHour;


        Random random = new Random();
        int EmpCheck = random.nextInt(0, 2);
        if (EmpCheck == 1) {
            FullDayHour = 8;
            System.out.println("Present");

        } else {
            FullDayHour = 0;
            System.out.println("Absent");
        }

        DailyWage = WagePerHour * FullDayHour;
        System.out.println("Daily Wage is: " + DailyWage);

    }
}