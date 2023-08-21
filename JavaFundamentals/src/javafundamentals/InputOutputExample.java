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
public class InputOutputExample {
    public static void main(String[] args) {
        // input data training
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Digite seu nome: ");
        name = scan.nextLine();
        System.out.println("Bem vindo! Sr(a) " + name);
        
        // output data training
        float value = 99.9f;
        int value2 = 10;
        System.out.println("Value1: " + value + ", Value2: " + value2);
        System.out.print("Hello World From Print.\n");
        System.out.println("Hello World From Println.");
        System.out.println("The value of Java is: " + value);
        System.out.printf("The value of Java is: %f", value);
    }
}
