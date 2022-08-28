public class Produto {
    String nome;
    double nota;
    String partNumber;
    int quantidade;

    //Todo produto precisa ter um fabricante, dessa forma, é preciso criar um objeto fabricante dentro do produto
    Fabricante fabricante; //variavel de referencia (como se fosse um ponteiro)

    public Produto(String nome, double nota, String partNumber, int quantidade) {
        this.nome = nome;
        this.nota = nota;
        this.partNumber = partNumber;
        this.quantidade = quantidade;
        System.out.println("Produto criado");

        // estou atrelando a existencia do fabricante diretamente a existencia do produto
        fabricante = new Fabricante();
    }

    public void mostraInfo()
    {

    }



}
