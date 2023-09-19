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
public class CreatingFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String filename;
        System.out.print("Ei mah, digite o nome desse arquivo: ");
        filename = scan.next();
        scan.close();
        filename = filename.concat(".txt");

        try {
            File myfile = new File(filename);
            if (myfile.createNewFile()) {
                System.out.println("Arquivo Criado com Sucesso.");
            } else {
                System.out.println("Erro: Arquivo ja criado!");
            }
            if (myfile.exists()) {
                System.out.println("Filename: " + myfile.getName());
                System.out.println("Path of file: " + myfile.getAbsolutePath());
                System.out.println("Write Permission: " + myfile.canWrite());
                System.out.println("Read Permission: " + myfile.canRead());
                System.out.println("File Lenght: " + myfile.length());
            } else {
                System.out.println("File not found!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Escrendo no Arquivo!");
        try {
            FileWriter objWriter = new FileWriter(filename, true);
            objWriter.write(" - Agora é appendable.");
            objWriter.close();
            System.out.println("Conteúdo salvo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lendo o Arquivo!");
        try {
            File fileObj = new File(filename);
            Scanner reader = new Scanner(fileObj);
            while (reader.hasNextLine()) {
                String dt = reader.nextLine();
                System.out.println(dt);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
