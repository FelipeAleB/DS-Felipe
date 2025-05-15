package vacina;
import java.util.Scanner;

public class Vacina {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o tamanho do seu arranjo de genes. ");
        
        int tamanho = entrada.nextInt();
        int[] n = new int[tamanho];
                
        for (int i = 0; i < tamanho; i++) {
            n[i] = (int)(Math.random() * tamanho);
        }
        
        int ultimoN = n[tamanho - 1];
        
        int contador = 0;
        for (int i = 0; i < tamanho - 1; i++) {
            if (n[i] == ultimoN) {
                contador++;
        }
        }
        
        System.out.println("Genes para serem analisados: ");
        for (int num : n) {
            System.out.print(num + " ");
        }
        System.out.println();
        if (contador > 1) {
            System.out.println("Achei o danado!!");
        } else if (contador == 1) {
            System.out.println("Ainda nao eh o suficiente!");
        } else {
            System.out.println("Sumiuu!");
        }
    }
}