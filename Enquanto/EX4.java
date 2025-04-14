
package ex4;
import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos tem na classe: ");
        int alunos = entrada.nextInt();
        
        double somaNotas = 0;
        int cont = 0;
        
        while (cont < alunos) {
            System.out.println("Quanto o aluno tirou " + (cont + 1) + ": ");
            double nota = scanner.System.in();
            somaNotas += nota;
            cont++;
        }
        
        double media = somaNotas / alunos;
        System.out.println("Essa é a media da turma: " + media);
        

    }
    
}