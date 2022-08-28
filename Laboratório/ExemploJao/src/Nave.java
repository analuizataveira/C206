public class Nave {
    String nome;

    // temos uma associacao
    Arma arma; //classe dentro de classe

    public Nave(String nome, Arma arma) {
        this.nome = nome;
        //System.out.println(arma);
        this.arma = arma;
        //System.out.println(this.arma);

    }

    public void addArma(Arma arma)
    {
        this.arma=arma;


    }
}
