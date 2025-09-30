import java.util.Scanner;

public class ArrayCreationLab {
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
        // Part 1
        int[] scores;
        scores = new int[5];
        System.out.println("Array length: " + scores.length);
        
        // Part 2
        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) System.out.println(color);

        // Part 3
        double[] prices = new double[3];
        prices[0] = 9.99;
        prices[1] = 14.50;
        prices[2] = 20.00;
        for (double price : prices) System.out.print(price + " ");
        System.out.print('\n');

        // Part 4
        int foodLength = getIntInput("How many favorite foods? ");
        String[] foods = new String[foodLength];
        scanner.nextLine();
        for (int i = 0; i < foodLength; i++) {
            String food = getInput("Enter food " + (i + 1) + ": ");
            foods[i] = food;
        }

        System.out.print("Your favorite foods are: ");
        for (int i = 0; i < foods.length; i++) {
            System.out.print(foods[i]);
            // Don't put comma at the end of list
            if (i != foods.length - 1) System.out.print(", ");
        }

        scanner.close();
    }
}