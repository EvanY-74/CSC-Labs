public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    // 1. Two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2. Three integers  
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 3. Two double values
    public static double multiply(double a, double b) {
        return a * b;
    }

    // 4. An integer and a string (repeat the string that many times)
    public static String multiply(int repetitions, String str) {
        String result = "";
        for (int i = 0; i < repetitions; i++) {
            result += str;
        }
        return result;
    }
    
    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}