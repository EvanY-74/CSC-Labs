import java.util.Scanner;

public class Problem4 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int correctAnswers = 0;

        String answer1 = getInput("What is the capital of France? ");
        if (answer1.equals("Paris")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else System.out.println("Incorrect. The answer is Paris.");

        String answer2 = getInput("What is 2 + 2? ");
        if (answer2.equals("4")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else System.out.println("Incorrect. The answer is 4.");

        String answer3 = getInput("What language are we learning? ");
        if (answer3.equals("Java")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else System.out.println("Incorrect. The answer is Java.");

        switch (correctAnswers) {
            case 0:
                System.out.println("You got 0/3 :(");
                break;
            case 1:
                System.out.println("You got 1/3 :|");
                break;
            case 2:
                System.out.println("You got 2/3 :)");
                break;
            case 3:
                System.out.println("You got 3/3 - Perfect!");
                break;
        }
    }
}