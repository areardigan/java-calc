package AddNums;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {

        int numOfStudents = 2;
        int numOfTests = 2;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++){
            double total = 0;

            for(int j = 0; j < numOfTests; j++ ){
                System.out.println("Score for student "+(i+1) + "-- test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total / numOfTests;
            System.out.println("Test average for student # " + (i+1) + " is " + average);
            System.out.println("***********************");
        }

        scanner.close();

    }
}
