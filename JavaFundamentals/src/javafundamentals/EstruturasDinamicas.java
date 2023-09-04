/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class EstruturasDinamicas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdParticipantes;
        List<String> nomes = new ArrayList<>();
        System.out.print("Digite a quantidade de participantes: ");
        qtdParticipantes = scan.nextInt();
        
        for(int i = 0; i < qtdParticipantes; i++) {
            System.out.print("Digite o nome: ");
            nomes.add(scan.next());
        }
        
        for(String n: nomes) {
            System.out.println(n);
        }
        
    }
}
