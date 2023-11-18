package javafundamentals.resolucaonp2;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota01, nota02, media;
        System.out.println("Nota 01:");
        nota01 = scan.nextDouble();
        System.out.println("Nota 02: ");
        nota02 = scan.nextDouble();
        media = (nota01 + nota02) / 2;
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media < 4.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Final");
        }
        scan.close();
    }
}