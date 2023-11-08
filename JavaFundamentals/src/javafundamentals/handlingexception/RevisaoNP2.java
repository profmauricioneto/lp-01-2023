/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals.handlingexception;

/**
 *
 * @author maumneto
 */
public class RevisaoNP2 {

    public static int iterativeDivide(int... args) throws ArithmeticException {
        int total = 1;
        try {
            for (int i : args) {
                total /= i;
            }
        } catch(ArithmeticException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return total;
    }

    public static String toLowerCase(String phrase) throws Exception {
        String newPhrase = null;
        try {
            newPhrase = phrase.toLowerCase();
        } catch(NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        }
        return newPhrase;
    }

    public static void main(String[] args) {
        int result = 0;
        result = iterativeDivide(1,2,3,4,5,0);
//        System.out.println(toLowerCase("OLA A TODOS"));
    }
}
