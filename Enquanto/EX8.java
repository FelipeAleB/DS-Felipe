
package ex8;
import java.util.Scanner;

public class EX8 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva qual vai ser o tamanho do lado(entre 1 e 20): ");
        int lado = scanner.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("O Tamnaho do quadrado deve estar 1 e 20.");
        } else {
            for (int x = 0; x < lado; x++) {
                for (int y = 0; y < lado; y++) {
                    if (x == 0 || x == lado - 1 || y == 0 || y == lado - 1 ){
                    System.out.print("#");
                } else {
                System.out.print(" ");
            }
           }
                System.out.println();
            }
        }
        scanner.close();
    }
        }