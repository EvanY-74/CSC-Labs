public class PasswordGenerator {
    
    // Create methods to generate:

    public static int randomInt(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }

    // 1. A random lowercase letter
    public static char getRandomLower() {
        return (char)randomInt('a', 'z');
    }

    // 2. A random uppercase letter  
    public static char getRandomUpper() {
        return (char)randomInt('A', 'Z');
    }

    // 3. A random digit character
    public static char getRandomDigit() {
        return (char)randomInt('0', '9');
    }

    // 4. A random special character from: !@#$%^&*
    public static char getRandomSpecial() {
        String SPECIAL_CHARACTERS = "!@#$%^&*";
        return SPECIAL_CHARACTERS.charAt(randomInt(0, SPECIAL_CHARACTERS.length() - 1));
    }

    // 5. A method that generates a password of specified length 
    //    containing a mix of all character types
    public static String generatePassword(int length) {
        String password = "";
        for (int i = 0; i < length; i++) {
            switch (randomInt(0, 3)) {
                case 0:
                    password += getRandomLower();
                    break;
                case 1:
                    password += getRandomUpper();
                    break;
                case 2:
                    password += getRandomDigit();
                    break;
                case 3:
                    password += getRandomSpecial();
                    break;
                default:
                    break;
            }
        }

        return password;
    }
    
    public static void main(String[] args) {
        // System.out.println((char)('a' + 25));
        System.out.println("Random lowercase: " + getRandomLower());
        System.out.println("Random uppercase: " + getRandomUpper());
        System.out.println("Random digit: " + getRandomDigit());
        System.out.println("Random special: " + getRandomSpecial());
        System.out.println("8-character password: " + generatePassword(8));
    }
}