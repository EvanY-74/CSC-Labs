/*
Name: Evan Yango
Date: 10/2/25
Description: Passes all of them to a method named maxDifference that returns the difference between the largest and smallest numbers.
*/

import java.util.Scanner;

public class MaxDifference {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int[] splitIntegers(String input) {
        String[] stringIntegers = input.split(" ");
        int[] integers = new int[stringIntegers.length];
        for (int i = 0; i < stringIntegers.length; i++) integers[i] = Integer.parseInt(stringIntegers[i]);
        return integers;
    }

    public static int max(int[] integers) {
        int result = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > result) result = integers[i];
        }
        return result;
    }
    
    public static int min(int[] integers) {
        int result = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < result) result = integers[i];
        }
        return result;
    }

    public static int maxDifference(int[] integers) {
        return max(integers) - min(integers);
    }

    public static void main(String[] args) {
        int[] integers = splitIntegers(getInput("Enter numbers:\n"));

        System.out.println("Maximum difference: " + maxDifference(integers));

        scanner.close();
    }
}