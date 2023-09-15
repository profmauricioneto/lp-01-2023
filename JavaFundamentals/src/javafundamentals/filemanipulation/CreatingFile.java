package javafundamentals.filemanipulation;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author maumneto
 */
public class CreatingFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String filename;
        System.out.print("Ei mah, digite o nome desse arquivo: ");
        filename = scan.next();
        scan.close();
        filename = filename.concat(".txt");
        
        try {
            File myfile = new File(filename);
            if(myfile.createNewFile()) {
                System.out.println("Arquivo Criado com Sucesso.");
            } else {
                System.out.println("Erro: Arquivo não criado.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            FileWriter objWriter = new FileWriter(filename, true);
            objWriter.write(" - Agora é appendable.");
            objWriter.close();
            System.out.println("Conteúdo salvo com sucesso 2.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
        