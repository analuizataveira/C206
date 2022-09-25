public class Produto {

    private String preco;
    private String nome;

    public void etiquetaPreco()
    {

        System.out.println("Preco: " +this.preco);
        System.out.println("Nome: " +this.nome);

    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
