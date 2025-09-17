import java.util.Scanner;

public class SumCalculator {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        int sum = 0;
        while (sum < 100) {
            int input = getIntInput("Sum: " + sum + " | Enter an integer: ");
            sum += input;
        }

        System.out.println("Total sum: " + sum);
        
        scanner.close();
    }
}