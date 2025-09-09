import java.util.Scanner;

public class LeapYear {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        int year = getIntInput("Enter a number: ");
        if (year % 400 == 0) System.out.println(year + " is a leap year.");
        else if (year % 100 == 0) System.out.println(year + " is not a leap year.");
        else if (year % 4 == 0) System.out.println(year + " is a leap year.");
        else System.out.println(year + " is not a leap year.");
    }
}