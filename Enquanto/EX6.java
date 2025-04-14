package ex6;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numes = new int[10];

        System.out.println("Digite 10 numeros: ");
        for (int x = 0; x < 10; x++) {
            numes[x] = entrada.nextInt();
        }

        int MaiorNum = numes[0];

        for (int num1 : numes) {
            if (num1 > MaiorNum) { 
                MaiorNum = num1;
            }
        }

        System.out.println("Esse é o maior numero: " + MaiorNum);
        entrada.close();
    }
}