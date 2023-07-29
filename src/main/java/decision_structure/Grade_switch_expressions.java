package decision_structure;

import java.util.Scanner;

public class Grade_switch_expressions {
    public static void main(String[] args) {
        System.out.println("Enter the letter grade...");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade){
            case "A", "B" -> "DOPE!";
            case "C" -> "Study harder...";
            case "D" -> "Are you even trying...";
            case "F" -> "Ouch...";
            default -> "Do better...";
        };

        System.out.println(message);

    }
}
