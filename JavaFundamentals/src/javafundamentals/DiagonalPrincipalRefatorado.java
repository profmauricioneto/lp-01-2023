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
public class DiagonalPrincipalRefatorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linhas = 0;
        int colunas = 0;
        System.out.print("Quantidade de Linhas: ");
        linhas = scan.nextInt();
        System.out.print("Quantidade de Colunas: ");
        colunas = scan.nextInt();
        
        if(linhas != colunas) {
            System.out.println("Não é possível calcular diagonal principal em matriz não quadrada.");
        } else {
            int matrix[][] = new int[linhas][colunas];
            int somaDiagonal = 0;

            for(int i = 0; i < linhas; i++) {
                for(int j = 0; j < colunas; j++) {
                    System.out.printf("Matrix[%d][%d] = ", i, j);
                    matrix[i][j] = scan.nextInt();
                    if(i == j) {
                        somaDiagonal += matrix[i][j];
                    }
                }
            }
            System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonal);    
        }
    }
}
