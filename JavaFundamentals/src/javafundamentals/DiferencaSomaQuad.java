package javafundamentals;

/**
 *
 * @author maumneto
 */
public class DiferencaSomaQuad {
    public static void main(String[] args) {
        int somaQuad = 0;
        int quadSoma = 0;
        int index = 1;
        
        while(index <= 10) {
            somaQuad = somaQuad + index*index;
            quadSoma = quadSoma + index;
            index++;
        }
        quadSoma = quadSoma*quadSoma;
        int diff;
        diff = quadSoma - somaQuad;
        System.out.println("Soma dos Quadrados: " + somaQuad);
        System.out.println("Quadrado da Soma: " + quadSoma);
        System.out.println("Diferença: " + diff);
    }
}
