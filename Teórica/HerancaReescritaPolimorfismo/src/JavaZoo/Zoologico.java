package JavaZoo;

public class Zoologico {
    private String nome;
    private String endereco;


    //Atributo implicito
    Animal [] bixo = new Animal[100];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
