import java.util.Scanner;

public class Problem2 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static double roundDecimal(double decimal, int places) {
        double multiplicative = Math.pow(10, places);
        return Math.round(decimal * multiplicative) / multiplicative;
    }

    public static void main(String[] args) {
        final int NUM_OF_TESTS = 3;
        int sum = 0;
        for (int i = 1; i <= NUM_OF_TESTS; i++) {
            sum += getIntInput("Enter test score " + i + ": ");
        }
        double grade = roundDecimal((double) sum / NUM_OF_TESTS, 2);
        char letterGrade;
        if (grade >= 90) {
            letterGrade = 'A';
        } else if (grade >= 80) {
            letterGrade = 'B';
        } else if (grade >= 70) {
            letterGrade = 'C';
        } else if (grade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("Your average score is " + grade + ". Your letter grade is " + letterGrade + ".");
    }
}