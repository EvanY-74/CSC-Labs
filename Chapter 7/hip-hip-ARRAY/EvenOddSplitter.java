/*
Name: Evan Yango
Date: 10/2/25
Description: Prints the even numbers on one line and the odd numbers on another.
*/

import java.util.Scanner;

public class EvenOddSplitter {
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

    public static String arrayToString(int[] array) {
        String result = "";
        for (int element : array) result += element + " ";
        return result;
    }

    public static int[] getEvens(int[] nums) {
        // count the amount of even numbers
        int length = 0;
        for (int num : nums) {
            if (num % 2 == 0) length++;
        }
        
        // append even numbers
        int index = 0;
        int[] evens = new int[length];
        for (int num : nums) {
            if (num % 2 == 0) {
                evens[index] = num;
                index++;
            }
        }

        return evens;
    }
    
    public static int[] getOdds(int[] nums) {
        // count the amount of odd numbers
        int length = 0;
        for (int num : nums) {
            if (num % 2 == 1) length++;
        }
        
        // append odd numbers
        int index = 0;
        int[] odds = new int[length];
        for (int num : nums) {
            if (num % 2 == 1) {
                odds[index] = num;
                index++;
            }
        }
        return odds;
    }

    public static void main(String[] args) {
        int[] integers = splitIntegers(getInput("Enter 15 integers with one space between each integer:\n"));
        if (integers.length != 15) {
            System.out.println("You must enter 15 integers.");
            return; // exit out of main
        }

        System.out.println("Even numbers: " + arrayToString(getEvens(integers)));
        System.out.println("Odds numbers: " + arrayToString(getOdds(integers)));
        
        scanner.close();
    }
}