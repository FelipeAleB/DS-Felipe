
package projetocarro;

public class Kombi {
    String nomeKB;
    String marcaKB;
    int anoKB;
    int velKB;
    

    void acelerar(int aceleracao) {
        velKB += aceleracao;
    }
    
    void freiar(int reduzir) {
        velKB -= reduzir;
    }
    
    void buzinar() {
        System.out.println("Kombi Buzinando");
    }
    
    void tocarmusica() {
        System.out.println("Teus sinais me confundem da cabeca aos pes, Mas por dentro eu te devoro. . . .");
    }
    
    }