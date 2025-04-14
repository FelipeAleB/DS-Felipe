
package ex5;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha um numero: ");
        int a = entrada.nextInt();
      
        System.out.println("Insira outro numero: ");
        int b = entrada.nextInt();
        
        System.out.println("O primeiro numero eh: " + a + "  O segundo eh: " +b);
        
        int x = a;
        int y = b;
              
        int troca = a = b;
        int troca2 = y = x;
             System.out.println("O primeiro numero eh: " + troca + "  O segundo eh: " + troca2);

           
    }
    
}