package javafundamentals;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int termos, aux;
        int a = 0, b = 1;
        System.out.print("Digite a quantidade de termos: ");
        termos = scan.nextInt();

        if (termos <= 0) {
            System.out.println("Nao tem fibonacci!");
        } else if (termos == 1) {
            System.out.println(a);
        } else if (termos == 2) {
            System.out.println(a + "\n" + b);
        } else {
            System.out.println(a);
            System.out.println(b);
            for (int index = 2; index < termos; index++) {
                aux = a + b;
                a = b;
                b = aux;
                System.out.println(aux);
            }
        }

    }
}
