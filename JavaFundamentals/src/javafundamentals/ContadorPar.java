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
public class ContadorPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[10];
        int contPar = 0;
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o vetor[%d]: ", i);
            vetor[i] = scan.nextInt();
            if (vetor[i] % 2 == 0) {
                contPar++;
            }
        }
        scan.close();
        System.out.println("Quantidade de Pares digitados: " + contPar);
      
    }
}
