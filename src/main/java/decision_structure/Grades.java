package decision_structure;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Enter the letter grade...");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        
        String message = "";
        
        switch(grade){
            case "A":
                message = "DOPE!";
                break;
            case "B": 
                message = "Almost there...";
                break;
            default:
                message = "Do better...";
                break;
        }

        System.out.println(message);

    }
}
