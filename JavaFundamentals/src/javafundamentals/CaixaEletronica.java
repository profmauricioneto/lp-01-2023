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
public class CaixaEletronica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota50, nota10, nota5, nota1, valor;
        System.out.print("Digite o valor do dinheiro: ");
        valor = scan.nextInt();
        
        nota50 = (int)valor/50;
        valor = valor % 50;
        nota10 = (int)valor/10;
        valor = valor % 10;
        nota5 = (int)valor/5;
        valor = valor % 5;
        nota1 = valor;
        
        System.out.println("Nota50: " + nota50);
        System.out.println("Nota10: " + nota10);
        System.out.println("Nota5: " + nota5);
        System.out.println("Nota1: " + nota1);
    }
}
