package javafundamentals.resolucaonp2;

import java.util.Scanner;

public class Questao04 {
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double calcularPesoIdeal(String genero, double altura) {
        if(genero.equals("h") || genero.equals("homem")) {
            return 72.7 * altura - 58;
        } else if(genero.equals("m") || genero.equals("mulher")) {
            return 62.1 * altura - 44.7;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso, altura, pesoIdeal, imc;
        String genero;
        System.out.println("Peso: ");
        peso = scan.nextDouble();
        System.out.println("Altura: ");
        altura = scan.nextDouble();
        imc = calcularImc(peso, altura);
        System.out.println("IMC = " + imc);
        System.out.println("Genero: ");
        genero = scan.next();
        pesoIdeal = calcularPesoIdeal(genero, altura);
        if(pesoIdeal < 0) {
            System.out.println("Erro. Gênero inválido.");
        } else {
            System.out.println("Peso ideal = " + pesoIdeal);
        }
    }
}
