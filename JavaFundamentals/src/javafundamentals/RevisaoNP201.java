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
public class RevisaoNP201 {
    
    public static double calculoImc(double peso, double altura) {
        return peso/(altura*altura);             
    }
    
    public static double calculoPesoIdeal(String genero, double altura) {
        double pesoIdeal = 0;
        switch(genero) {
            case "h":
                pesoIdeal = 72.7*altura - 58;
                break;
            case "m":
                pesoIdeal = 62.1*altura - 44.7;
                break;
            default:
                System.out.println("Genero Invalido!");
        }
        return pesoIdeal;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso, altura, pesoIdeal, imc;
        String genero;
        System.out.println("Digite genero: ");
        genero = scan.next();
        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = scan.nextDouble();
        imc = calculoImc(peso, altura);
        System.out.println("Seu IMC é: " + imc);
        pesoIdeal = calculoPesoIdeal(genero, altura);
        System.out.println("Seu peso Ideal é: " + pesoIdeal);
    }
}
