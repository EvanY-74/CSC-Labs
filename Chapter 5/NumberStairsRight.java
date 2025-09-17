import java.util.Scanner;

public class NumberStairsRight {
    public static Scanner scanner = new Scanner(System.in);
  
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        final char STAIR_CHARACTER = scanner.nextLine().trim().charAt(0);

        int height = getIntInput("Enter stair height: ");

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(STAIR_CHARACTER);
            }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(' ');
        //     }
        //     for (int j = 1; j <= 10 - i; j++) {
        //         System.out.print('#');
        //     }
            System.out.print('\n');
        }
        
        scanner.close();
    }
}