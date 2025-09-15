import java.util.Scanner;

public class NumberManipulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        // Store the input in a variable
        System.out.print("Enter a decimal number: ");
        double number = input.nextDouble();

        // Print the smallest integer greater than or equal to the number
        System.out.println("Smallest int greater than or equal to " + number + ": " + (int)Math.ceil(number));

        // Print the largest integer less than or equal to the number
        System.out.println("Greatest int less than or equal to " + number + ": " + (int)Math.floor(number));

        // Print the integer that is closest to the number (ties go to even)
        System.out.println("Closest integer (ties go to even number) to " + number + ": " + (int)Math.rint(number));

        // Print the integer closest to the number (standard rounding)
        System.out.println("Closest integer to " + number + ": " + (int)Math.round(number));


        // BONUS:
        // Cast the number to an int and print the character it represents
        char character = (char)number;
        System.out.println("char version: " + character);

        // Add 1 to that number and print the next character
        System.out.println("char + 1: " + (++character));

        // Format a summary table using formatted output
        System.out.printf("  ceil | %d\n", (int)Math.ceil(number));
        System.out.printf(" floor | %d\n", (int)Math.floor(number));
        System.out.printf("  rint | %d\n", (int)Math.rint(number));
        System.out.printf(" round | %d\n", (int)Math.round(number));
        System.out.printf("(char) | %c\n", (char)(number));

        input.close();
    }
}
