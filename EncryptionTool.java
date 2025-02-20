/**
 * EncryptionTool.java
 * A simple encryption tool that implements the Caesar cipher.
 * Prompts user for a message and amount to shift, and then encrypts message and decrypts back to original input.
 * Author: Ethan Urowsky
 * Date: 02/19/2025
 */
package block2;

import java.util.Scanner; //Scanner for user input.

public class EncryptionTool {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner for user input.
		
		// Prompt and read-in message and shift amount.
		System.out.println("Enter a message:");
		String message = scanner.nextLine();
		System.out.println("Enter a shift value:");
		int shiftValue = scanner.nextInt();
		
		// Encrypt and decrypt message.
		String encryptedMessage = encrypt(message, shiftValue);
		String decryptedMessage = decrypt(encryptedMessage, shiftValue);
		
		// Output encryption and decryption.
		System.out.println("Encrypted message : " + encryptedMessage);
		System.out.println("Decrypted message : " + decryptedMessage);
	}


	 /**
     * This method performs a Caesar cipher shift on the given input.
     * @param text - The input message to be shifted.
     * @param shift - The number of characters to shift each letter.
     * @return The modified text after applying the shift.
     */
	private static String caesarShift(String text, int shift) {
		StringBuilder shifted = new StringBuilder(); // holds shifted message
		
		shift = shift % 26; // ensure value is in range of alphabet.
		
		for (char ch : text.toCharArray()) { // loop through characters in message.
            if (Character.isLetter(ch)) { // ensure only letters.
                char start;
                if (Character.isUpperCase(ch)) { // upper or lower case.
                    start = 'A';
                } else {
                    start = 'a';
                }

                ch = (char) ((ch - start + shift + 26) % 26 + start); // apply shift.
            }
            shifted.append(ch); // Append modified or unchanged character.
        }
        return shifted.toString(); // return shifted message.
    }
	
	/**
     * Encrypts a message using the Caesar cipher.
     * @param messageToEncrypt - The input message to be shifted.
     * @param shift - The number of characters to shift each letter.
     * @return The encrypted message.
     */
	public static String encrypt(String messageToEncrypt, int shift) {
        return caesarShift(messageToEncrypt, shift);
    }

	/**
     * Decrypts a message using the Caesar cipher.
     * @param messageToDecrypt - The input message to be shifted.
     * @param shift - The number of characters to shift back each letter.
     * @return The decrypted message.
     */
    public static String decrypt(String messageToDecrypt, int shift) {
        return caesarShift(messageToDecrypt, -shift);
    }
}


