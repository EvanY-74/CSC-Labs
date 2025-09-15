import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        // Store the sentence in a String variable
        System.out.print("Enter a full sentence: ");
        String sentence = input.nextLine();

        // Print the number of characters in the sentence
        System.out.println("length: " + sentence.length());

        // Print the first and last characters
        System.out.println("first and last characters: " + sentence.charAt(0) + " and " + sentence.charAt(sentence.length() - 1));


        // Print the sentence with whitespace removed from both ends
        System.out.println("Trimmed sentence: " + sentence.trim());

        // Print the sentence in all uppercase
        System.out.println("All uppercase: " + sentence.toUpperCase());

        // Print the sentence in all lowercase
        System.out.println("All lowercase: " + sentence.toLowerCase());


        // Prompt the user to enter a single character
        System.out.print("Enter a single character: ");
        char character = input.nextLine().trim().charAt(0);

        // Determine if it is a letter, digit, or neither
        // If it's a letter, check if it's uppercase or lowercase
        // Print the decimal code of the character
        if (Character.isLetter(character)) {
            System.out.println(character + " is " + (Character.isUpperCase(character) ? "upper" : "lower") + " case.");
        } else System.out.println("Decimal code of " + character + ": " + (short)character);

        // BONUS:
        // Prompt the user for a substring to search for
        // Display the index of the first occurrence or -1 if not found
        System.out.println("Enter a substring of the sentence: " + sentence);
        String substring = input.nextLine();
        System.out.println(sentence.indexOf(substring));
    }
}
