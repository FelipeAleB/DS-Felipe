
package ex1;
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha um numero: ");
        int a = entrada.nextInt();
      
        System.out.println("Insira outro numero: ");
        int b = entrada.nextInt();
        
        int soma = a + b;
        int sub = a - b;
        int div = a / b;
        int mult = a * b;
             
        System.out.println("A soma eh: " + soma + ",  A subtracao eh: " + sub + ",  A divisao eh: " + div + "  E a multiplicao eh: "+mult);
        
    }
    
}