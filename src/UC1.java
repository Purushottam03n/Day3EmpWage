import java.util.Random;

public class UC1 {
    public static void main(String[] args){

        Random random = new Random();
        int EmpCheck = random.nextInt(0, 2);
        if(EmpCheck==1){
            System.out.println("Present");
        }else{
            System.out.println("Absent");
        }
    }
}
