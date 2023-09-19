/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals.filemanipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class FileProject {
    public static void writeInFile(String name, int age, String filename) {
        File fileObj = new File(filename);
        try{
            FileWriter writer = new FileWriter(fileObj, true);
            writer.write("name: " + name + " age: " + age + "\n");
            writer.close();
            System.out.println("Gravado com Sucesso.");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void readFile(String filename) {
        try {
            File myFile = new File(filename);
            Scanner reader = new Scanner(myFile);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteFile(String filename) {
        File myFile = new File(filename);
        if (myFile.delete()) {
            System.out.println("Arquivo Deletado em: " + myFile.getAbsolutePath());
        } else {
            System.out.println("Erro: Não foi possível deletar arquivo.");
        }
    }
    
    public static void menu() {
        System.out.println("1 - Cadastro");
        System.out.println("2 - Leitura");
        System.out.println("3 - Deletar Arquivo");
        System.out.println("4 - Sair");
        System.out.print("Opção: ");
    }
    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        String name;
        String filename;
        int age;
        int option;
        
        System.out.print("Digite o nome do arquivo: ");
        filename = scan.next();
        filename = filename.concat(".txt");
        
        File myfile = new File(filename);
        if(myfile.createNewFile()) {
            System.out.println("Arquivo Criado!");
        }
        
        
        do {
            menu();
            option = scan.nextInt();
            
            switch(option) {
                case 1: {
                    scan.nextLine();
                    System.out.print("Digite o nome: ");
                    name = scan.nextLine();
                    System.out.print("Digite sua idade: ");
                    age = scan.nextInt();
                    writeInFile(name, age, filename);
                    break;
                }
                case 2: {
                    readFile(filename);
                    break;
                }
                case 3: {
                    deleteFile(filename);
                    break;
                }
                case 4: {
                    System.out.println("Saindo do Programa!");
                    break;
                }
                default: {
                    System.out.println("Nenhuma opção válida!");
                }
            }            
        } while(option != 4);
        scan.close();
    }
}
