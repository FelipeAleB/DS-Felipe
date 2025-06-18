
package projetocarro;

public class Moto {

    String nomeMoto;
    String marcaMoto;
    int anoMoto;
    int velMoto;

    void acelerarM(int props) {
        velMoto = velMoto + props;
        System.out.println("Sua moto foi para a velocidade: " + velMoto + " KM/h");
    }

    void freiarM(int para) {
        velMoto = velMoto - para;
        System.out.println("Sua moto diminuiu a velocidade para: " + velMoto + " KM/h");
    }

    void buzinarM() {
        System.out.println("Moto buzinando");
    }

    void grau() {
        System.out.println("GRAUUUUUUUU ! ! !");
    }


    
}
