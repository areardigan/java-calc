package loops;

import java.util.Scanner;

public class GrossPayInput {
    public static void main(String[] args) {
        double rate = 15;
        double max = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > max || hoursWorked < 0){
            System.out.println("Invalid. Must be an int between 0-40...");

            hoursWorked = scanner.nextDouble();


        }
        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay: $" + grossPay);



    }
}
