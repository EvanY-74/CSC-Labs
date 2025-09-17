import java.util.Scanner;
import java.time.LocalDate;

public class MenuRepetition {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        int input;
        do {
            input = getIntInput("1 = say hello\n2 = display current time\n3 = exit\n");
            switch (input) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Current date: " + LocalDate.now());
                    break;
                case 3:
                    System.out.println("exiting...");
                    break;
                default:
                    System.out.println("Command not found :(");
                    break;
            }
        } while (input != 3);
        
        scanner.close();
    }
}