
package ex3;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Insira seu nome?: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite seu salario fixo?: ");
        int sfixo = entrada.nextInt();
         
        System.out.println("Quantas vendas fez no mes? (em dinheiro): ");
        float tv = entrada.nextFloat();
        
        float pc = sfixo * 15 / 100;
        
        float com = tv * pc;
     
        System.out.println("O nome do funcionario eh: " + nome + ",  o salario fixo eh: " + sfixo + ",  o salario no fim do mes e: " + com);
    }
    
}