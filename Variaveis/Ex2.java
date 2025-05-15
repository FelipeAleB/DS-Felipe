
package ex2;
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Diga a distancia total: ");
        int dtotal = entrada.nextInt();
      
        System.out.println("Insira o consumo total de combustivel gasto: ");
        int totalgasto = entrada.nextInt();
        
        int consumomedio = dtotal / totalgasto;
        System.out.println("O consumo medio eh de:  " +consumomedio);
    }
    
}