
package ex6;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Quanto o carro faz por litro? (em km): ");
         int ql = entrada.nextInt();
         System.out.println("Qual a distancia total?: ");
         int dt = entrada.nextInt();
         System.out.println("Qual o valor da gasolina?: ");
         float vg = entrada.nextFloat();
         
         float cg = ql * dt;
         float ct = vg * cg;
         System.out.println("O custo total da gasolina gasta eh de: "+ct);
    }
    
}