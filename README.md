# Block2Project Overview:
This is a very basic java encyrption and decryption tool. The program prompts the user to input a message and a shift value, then encrypts the message using the given shift and decrypts it back to the original input. This tool is for educational use only and should not be used for securing sensitive information.

# Ethical Considerations & Responsible Use: 
 This tool is for educational use only and should not be used for securing sensitive information. Caesers Cipher is not a secure encryption method. Users should be aware that this tool could be modified for malicious use. However, it was published with the intent to be used for educational purposes. Also, users must ensure that they are not using this program to encrypt sensitive or confidential information.

 # Limitations:
 - Not Secure: This tool is vulnerable since there are only 25 possible shift values.
 - Only Works with Letters: The tool only shifts alphabetic characters. So numbers, spaces, and punctuation remain the same.

# Prerequisites:
- Java Development Kit (JDK) installed (Version 8 or higher recommended).

- A command-line interface (CLI) such as Command Prompt, Terminal, or PowerShell.

# Steps to Run: 
- **Download the source file: Ensure you have EncryptionTool.java in your working directory.**

- **Compile the Java file:**
  
  javac EncryptionTool.java

- **Run the compiled program:**

  java EncryptionTool

- **Follow the prompts:**

   Enter a message to encrypt.

   Enter a shift value (an integer).

   The program will then output the encrypted message and then decrypt it back to original.
