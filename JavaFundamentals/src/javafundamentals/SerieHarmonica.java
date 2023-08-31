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
public class SerieHarmonica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int termos;
        double serieHarmonica = 0;
        System.out.println("Digite a quantidade de termos da H(n): ");
        termos = scan.nextInt();
        
        for(int i = 1; i <= termos; i++) {
            serieHarmonica = serieHarmonica + (double)1/i;
        }
        
        System.out.println("Valor de H(n): " + serieHarmonica);
    }
}
