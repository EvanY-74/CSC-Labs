import java.util.Scanner;

public class Zodiac {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        int year = getIntInput("Enter a year: ");
        String animal = switch (year % 12) {
            case 0 -> "monkey";
            case 1 -> "rooster";
            case 2 -> "dog";
            case 3 -> "pig";
            case 4 -> "rat";
            case 5 -> "ox";
            case 6 -> "tiger";
            case 7 -> "rabbit";
            case 8 -> "dragon";
            case 9 -> "snake";
            case 10 -> "horse";
            case 11 -> "sheep";
            default -> "";
        };

        System.out.println("the Chinese Zodiac animal for " + year + " is: " + animal);
        
        scanner.close();
    }
}