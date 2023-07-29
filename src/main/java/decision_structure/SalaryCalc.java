package decision_structure;
import java.util.Scanner;

public class SalaryCalc {

    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 200;
        int quota = 10;


        System.out.println("How many sales did the employee make this week?");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();




        if(sales < quota){
            System.out.println("Do better. No bonus for you.");
        }else{
            salary = salary + bonus;
            System.out.println("Congrats. You hit the bonus and are balling out with $" + salary);
        }


    }
}
