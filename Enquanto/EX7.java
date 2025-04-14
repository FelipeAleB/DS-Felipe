
package ex7;
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva qual vai ser o tamanho do lado (entre 1 a 20 ): ");
        int lado = scanner.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("O Tamnaho do quadrado deve estar (entre 1 a 20 )");
        } else {
            for (int x = 0; x < lado; x++) {
                for (int y = 0; y < lado; y++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
        }

        scanner.close();
    }
}