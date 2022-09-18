import java.util.Random;

public class UC3 {
    public static void main(String[] args){

        int Empcheck;
        int WagePerHour =20;
        int WorkingHour;
        int DailyWage;


        Random random = new Random();
        Empcheck = random.nextInt(0,3);
        if(Empcheck==1) {
            System.out.println("PRESENT");
            WorkingHour = 8;
        }
        else if(Empcheck==2){
            System.out.println("Part TIME");
            WorkingHour=8;

        }else
        {
            System.out.println("ABSENT");
            WorkingHour = 0;
        }
        DailyWage = WagePerHour* WorkingHour;
        System.out.println("Daily Wage of Employee is: " +DailyWage);
    }
}
