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
public class MediaAlunos {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner scan = new Scanner(System.in);
        // entrada de dados
        System.out.print("Digite a nota 1: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a nota 2: ");
        nota2 = scan.nextDouble();
        // processamento
        media = (nota1 + nota2)/2;
        // condicao do aluno
        System.out.println("Media: " + media);
        if( media >= 7.0) {
            System.out.println("Aprovado! Vaitimbora!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado! Fica ai!!");
            } else {
                System.out.println("Final! Vai fazer provinha!");
                double notaFinal, mediaFinal;
                System.out.print("Digite a nota da prova Final: ");
                notaFinal = scan.nextDouble();
                
                mediaFinal = (notaFinal + media)/2;
                System.out.println("Media Final: " + mediaFinal);
                
                if (mediaFinal >= 5.0) {
                    System.out.println("Aprovado na Final! Escapou hein!");
                } else {
                    System.out.println("Reprovado na Final! É, deu não!");
                } 
            }
        }
    }
}
