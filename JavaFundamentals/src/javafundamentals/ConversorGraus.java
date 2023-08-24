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
public class ConversorGraus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radiano, graus;
        //final double PI = 3.1415;
        // entrada de dados
        System.out.print("Digite o valor em Graus: ");
        graus = scan.nextDouble();
        //processamento
        radiano = (graus * Math.PI)/180;
        //radiano = (graus * PI)/180;
        // saida de dados
        System.out.println("O valor em radianos é: " + radiano);
        
        int idade = 33;
//        String isValid = (idade == 33) ? "Idade Correta": "Idade Errada";
    }
}
