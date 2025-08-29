import java.util.Scanner;

public class Problem1 {
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
        int tempFahrenheit = getIntInput("Enter temperature in Fahrenheit: ");
        double tempCelsius = (tempFahrenheit - 32) * 5 / 9.0;
        System.out.println(tempFahrenheit + "°F is equal to " + roundDecimal(tempCelsius, 2) + "°C");
    }
}