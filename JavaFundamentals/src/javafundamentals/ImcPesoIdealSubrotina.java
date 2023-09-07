/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

import java.util.Scanner;
/**
 *
 * @author maumneto
 */
public class ImcPesoIdealSubrotina {
    public static double imc (double peso, double altura) {
        return peso/(altura*altura);
    }
    
    public static double pesoIdeal(String genero, double altura) {
        double pesoIdeal = -1;
        if(genero.toLowerCase().equals("feminino") || genero.toLowerCase().equals("f")) {
            pesoIdeal = 72.7*altura - 58;
        } else if (genero.toLowerCase().equals("masculino") || genero.toLowerCase().equals("m")) {
            pesoIdeal = 62.1*altura - 44.7;
        } else {
            System.out.println("Genero Invalido");
        }
        return pesoIdeal;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String genero;
        double altura;
        double peso;
        double imcResult;
        double pesoIdealResult;
        System.out.print("Digite seu peso: ");
        peso = scan.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = scan.nextDouble();
        imcResult = imc(peso, altura);
        System.out.println("IMC = " + imcResult);
        System.out.print("Digite seu genero [masculino/feminino(m/f)]:");
        genero = scan.next();
        pesoIdealResult = pesoIdeal(genero, altura);
        System.out.println("Peso Ideal = " + pesoIdealResult);
        if (pesoIdealResult == -1) {
            System.out.println("Error no cálculo do peso ideal.");
        }
    }
}
