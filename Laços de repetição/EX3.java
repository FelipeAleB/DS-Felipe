/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;
import java.util.Scanner;
public class EX3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
            System.out.println("ESses são todos os números impares do 1 ate o valor escolhido");
        for (int x = 1; x <= num1; x ++){
                if (x % 2 != 0){
                    System.out.println(x);
                }
            }
        

        System.out.println("ESses são todos os números pares do 1 ate o valor escolhido");
        for (int x = 1; x <= num1; x ++){
                if (x % 2 == 0){
                    System.out.println(x);
                }
            }
    }
    
}