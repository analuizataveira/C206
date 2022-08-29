public class Cliente {
    //  Atributos
    String nome;
    long cpf;

    //Construtor
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Método
    public float calculaTotalCompra(float total, float valor){
        total = total + valor;
        return total;
    }

}


