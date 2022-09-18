import java.util.Random;

public class UC5 {
    public static void main(String[] args) {

        int WorkingHour;
        int TotalMonthWage;
        int TotalWage = 0;
        int WagePerHour = 20;
        int day = 1;
        int MaxWorkingDays = 20;

        while (day <= MaxWorkingDays) {
            Random random = new Random();
            int Empcheck = random.nextInt(0, 3);
            switch (Empcheck) {
                case UC4.PRESENT:

                case UC4.PARTTIME:
                    WorkingHour = 8;
                    break;
                default:
                    WorkingHour = 0;
                    break;
            }
            day++;

            TotalWage = WagePerHour * WorkingHour;
        }


        System.out.println("Total Daily Wage:" + TotalWage);

        TotalMonthWage=day*TotalWage;
        System.out.println("Totally Monthly Wages are: " +TotalMonthWage);
    }
}