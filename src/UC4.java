import java.util.Random;

public class UC4 {

    static final int PRESENT=1;
    static final int PARTTIME=2;
    static final int ABSENT= 0;


    public static void main(String[] args){


        int Empcheck;
        int WorkingHour;
        int TotalWage;
        int WagePerHour = 20;
        Random random = new Random();
        Empcheck = random.nextInt(0, 3);

        switch(Empcheck)
        {
            case PRESENT:
                WorkingHour=8;
                break;

            case PARTTIME:
                WorkingHour=8;
                break;

            default:
                WorkingHour=0;
                break;
        }
        TotalWage=WagePerHour*WorkingHour;
        System.out.println(" Total Wage :" +TotalWage);
    }

}
