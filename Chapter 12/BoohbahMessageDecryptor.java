import java.io.*;

/**
 * Boohbah Message Decryptor
 * 
 * STORY: The Boohbah have intercepted a secret message from an unknown enemy.
 * Intelligence suggests it's encrypted with a Caesar cipher (shift unknown).
 * Your mission: Read the encrypted message, decrypt it, and write the 
 * decrypted message to a file. Then determine who is attacking!
 */
public class BoohbahMessageDecryptor {
    
    /**
     * Decrypts a Caesar cipher encrypted message by shifting each letter back by the given shift amount.
     * Non-letter characters remain unchanged.
     * 
     * @param encrypted the encrypted message
     * @param shift the number of positions to shift back
     * @return the decrypted message
     */
    public static String decrypt(String encrypted, int shift) {
        StringBuilder decrypted = new StringBuilder();
        
        for (char c : encrypted.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    // Shift uppercase letters back by the given amount
                    char shifted = (char) (c - shift);
                    if (shifted < 'A') {
                        shifted = (char) (shifted + 26); // Wrap around
                    }
                    decrypted.append(shifted);
                } else {
                    // Shift lowercase letters back by the given amount
                    char shifted = (char) (c - shift);
                    if (shifted < 'a') {
                        shifted = (char) (shifted + 26); // Wrap around
                    }
                    decrypted.append(shifted);
                }
            } else {
                // Keep non-letter characters as-is
                decrypted.append(c);
            }
        }
        
        return decrypted.toString();
    }
    
    public static void main(String[] args) {
        // TODO: Declare variables for file paths
        String inputFile = "encrypted_message.txt";
        String outputFile = "decrypted_message.txt";
        
        // TODO: Try-with-resources block to handle IOException
        // Include file operations within the try parentheses so resources are automatically closed
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {
        
            // TODO: Read the encrypted message from the file (one line)
            String encryptedMessage = bufferedReader.readLine();
            
            // TODO: Try different shift values (0-25) until you find a decryption that makes sense
            // Loop through possible shift values and print each decryption attempt
            // When you find one that looks like a real message, note the shift value!
            for (int i = 0; i < 26; i++) {
                System.out.println("Shift " + i + ": " + decrypt(encryptedMessage, i));
            }
            
            // Once you've identified the correct shift value, use it to decrypt the message
            int correctShift = 3; 
            String decryptedMessage = decrypt(encryptedMessage, correctShift);
            
            // TODO: Write the decrypted message to the output file
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write(decryptedMessage);
            } catch (IOException e) { // AI auto complete suggested IOException here
                System.out.println("Could not write to file");
            }
            
            // TODO: Display results to console
            System.out.println("\n" + inputFile + ": " + encryptedMessage);
            System.out.println("(shift of " + correctShift + ") " + outputFile + ": " + decryptedMessage);
            System.out.println("STATUS: THREAT IDENTIFIED!");
            
        } catch (IOException e) {
            // TODO: Handle the IOException appropriately
            System.out.println("Could not read file");
        }
    }
}
