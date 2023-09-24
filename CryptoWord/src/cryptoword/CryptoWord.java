/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cryptoword;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class CryptoWord {
    /**
     * @return Word encrypted by substution technique
     * 
     * @param word the word that be encrypted
     * @param key The offset of encrypt algorithm
     */
    public static String cipherWord(String word, int key) {
        word = word.toLowerCase();
        String cipherWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (i > 'z') {
                cipherWord += (char)(word.charAt(i) - (26-key));
            } else {
                cipherWord += (char)(word.charAt(i) + key);
            }
        }
        return cipherWord;
    }
    
     /**
     * @return Word decrypted by substution technique
     * 
     * @param word the word that be decrypted
     * @param key The offset of decrypt algorithm
     */
    public static String decipherWord(String word, int key) {
        word = word.toLowerCase();
        String cipherWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (i > 'z') {
                cipherWord += (char)(word.charAt(i) + (26-key));
            } else {
                cipherWord += (char)(word.charAt(i) - key);
            }
        }
        return cipherWord;    
    }
    
    /**
     * @return Message encrypted by substution technique
     * 
     * @param message Message will be encrypted
     * @param key Offset used by word encrypted algorithm
     */
    public static String cipherMessage(String message, int key) {
        String[] arrayMessage = message.split(" ");
        StringBuilder cipherMessage = new StringBuilder();
        
        for (String word: arrayMessage) {
            cipherMessage.append(cipherWord(word, key)).append(" ");
        }
        String newCipherMessage = cipherMessage.toString();
        newCipherMessage.join(" ", arrayMessage);
        return newCipherMessage;
    }
    
    /**
     * @return Message decrypted by substution technique
     * 
     * @param message Message will be decrypted
     * @param key Offset used by word decrypted algorithm
     */
    public static String decipherMessage(String message, int key) {
        String[] arrayMessage = message.split(" ");
        StringBuilder decipherMessage = new StringBuilder();
        
        for (String word: arrayMessage) {
            decipherMessage.append(decipherWord(word, key)).append(" ");
        }
        String newDecipherMessage = decipherMessage.toString();
        newDecipherMessage.join(" ", arrayMessage);
        return newDecipherMessage;
    }
    
    /**
     * This is a main method responsible to receive words or messages and call the encrypt/decrypt algorithm
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String word;
        String option;
        int key;
        
        System.out.print("Do you want to encrypt a word or message[w/m]: ");
        option = input.nextLine();
        option = option.toLowerCase();
        
        if (option.contains("w") || option.contains("word")) {
            System.out.print("Write some word: ");
            word = input.next();
            System.out.println(word);
            System.out.print("Enter with a key: ");
            key = input.nextInt();
            
            String newWord = cipherWord(word, key);
            System.out.println("Cipher word: " + newWord);
            Thread.sleep(5000);
            System.out.println("Decipher word: " + decipherWord(newWord, key)); 
            
        } else if (option.contains("m") || option.contains("message")){
            System.out.print("Write the mensagem: ");
            String message = input.nextLine();
            System.out.print("Enter with a key: ");
            key = input.nextInt();
            
            String cipherMessage = cipherMessage(message, key);
            System.out.println("Cipher message: " + cipherMessage);
            Thread.sleep(5000);
            System.out.println("Decipher message: " + decipherMessage(cipherMessage, key));
        
        } else {
            System.out.println("No one option are selected.");
        }
        input.close();
    }
   
}
