package javafundamentals.handlingexception;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class DivisionHandlingException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value1, value2;
        double result = 0;
        System.out.print("Value 1: ");
        value1 = scan.nextInt();
        System.out.print("Value 2: ");
        value2 = scan.nextInt();
        try {
            result = value1/value2;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
//            System.out.println(e.getCause());
              e.printStackTrace();
        } finally {
            scan.close();
            System.out.println("Still running at all!");
        }
        System.out.println("Hellooo!");
    }
}
