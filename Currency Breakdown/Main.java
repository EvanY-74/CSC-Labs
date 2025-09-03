import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    
    public static void main(String[] args) {
        double dollars = getDoubleInput("Enter a monetary amount: ");
        System.out.println("Dollars: " + (int) dollars);
        int cents = (int)(dollars * 100) % 100;

        // System.out.println("Cents: " + cents);
        final int QUARTER = 25;
        int quarters = cents / QUARTER;
        cents %= QUARTER;
        System.out.println("Quarters: " + quarters);

        final int DIME = 10;
        int dimes = cents / DIME;
        cents %= DIME;
        System.out.println("Dimes: " + dimes);

        final int NICKEL = 5;
        int nickels = cents / NICKEL;
        cents %= NICKEL;
        System.out.println("Nickels: " + nickels);

        System.out.println("Pennies: " + cents);
    }
}