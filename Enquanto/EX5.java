package ex5;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Digite 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            num[i] = entrada.nextInt();
        }


        int MaiorNumex = num[0];
        int MaiorNumey = num[1];


        if (MaiorNumey > MaiorNumex) {
            int temp = MaiorNumex;
            MaiorNumex = MaiorNumey;
            MaiorNumey = temp;
        }


        for (int i = 2; i < 10; i++) {
            if (num[i] > MaiorNumex) {
                MaiorNumey = MaiorNumex;
                MaiorNumex = num[i];
            } else if (num[i] > MaiorNumey && num[i] != MaiorNumex) {
                MaiorNumey = num[i];
            }
        }

        if (MaiorNumex == MaiorNumey) {
            System.out.println("Todos tem o mesmo valor ou não tem um maior.");
        } else {
            System.out.println("Esses são seus 2 maiores numero: " + MaiorNumex + " e " + MaiorNumey);
        }


    }
}