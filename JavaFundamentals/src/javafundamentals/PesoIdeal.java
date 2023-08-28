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
public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura;
        double pesoIdeal = -1;
        String genero;
        
        System.out.print("Digite a sua altura: ");
        altura = scan.nextDouble();
        System.out.print("Digite seu genero: ");
        genero = scan.next();
        //genero = genero.toUpperCase();
        
        switch(genero.toUpperCase()) {
            case "HOMEM": 
            case "H": {
                pesoIdeal = 72.7*altura - 58;
                break;
            }
            case "MULHER":
            case "M": {
                pesoIdeal = 62.1*altura - 44.7;
                break;
            }
            default:
                System.out.println("Genero não válido.");
        }

//        if(genero.equals("HOMEM") || genero.equals("H")) {
//            pesoIdeal = 72.7*altura - 58;
//        } else if (genero.equals("MULHER")) {
//            pesoIdeal = 62.1*altura - 44.7;
//        } else {
//            System.out.println("Genero não válido.");
//        }
        
        System.out.println("Peso Ideal é: " + pesoIdeal);
    }
}
