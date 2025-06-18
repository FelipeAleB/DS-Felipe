package projetocarro;

public class ProjetoCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Civic";
        c1.marca = "Honda";
        c1.ano = 2018;
        c1.vel = 100;

        Moto m1 = new Moto();
        m1.nomeMoto = "Hornet";
        m1.marcaMoto = "Honda";
        m1.anoMoto = 2012;
        m1.velMoto = 90;

        Kombi k1 = new Kombi();
        k1.nomeKB = "Adventure";
        k1.marcaKB = "Volkswagen";
        k1.anoKB = 1985;
        k1.velKB = 80;

        System.out.println("Carro: " + c1.nome + ", Marca: " + c1.marca + ", Ano: " + c1.ano + ", Vel: " + c1.vel);
        System.out.println("Moto: " + m1.nomeMoto + ", Marca: " + m1.marcaMoto + ", Ano: " + m1.anoMoto + ", Vel: " + m1.velMoto);
        System.out.println("Kombi: " + k1.nomeKB + ", Marca: " + k1.marcaKB + ", Ano: " + k1.anoKB + ", Vel: " + k1.velKB);

        c1.buzinar();
        m1.buzinarM();
        k1.buzinar();
    }
}
