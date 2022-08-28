public class Estudante {

    //Atributos
    String nome;
    int idade;

    //Construtor
    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Agregação
    InfosContato contato;

    public void estudar()
    {
        System.out.println("O aluno "+nome+ " esta cadastrado no sistema");

    }

    public void mostraInfos() {
        System.out.println();
        System.out.println("--- INFORMAÇÕES DO ALUNO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " +idade);
    }


}
