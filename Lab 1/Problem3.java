import java.util.Scanner;

public class Problem3 {
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
        int secretNumber = 41;
        while (true) {
            int guess = getIntInput("Guess the number between 1 and 100: ");

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You got it!");
                return;
            }
        }
    }
}