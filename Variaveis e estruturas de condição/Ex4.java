
package ex4;
import java.util.Scanner; 

public class Ex4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Insira a base do triangulo: ");
        int b = entrada.nextInt();
      
        System.out.println("Determine a altura do triangulo: ");
        int h = entrada.nextInt();
        
        int a = (b*h)/2;
        System.out.println("A area do triangulo eh de:  " + a);
    }
    
}