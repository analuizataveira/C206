import java.sql.SQLOutput;

public class Estudante {
    //Atributos do estudante
    String nome;
    String anoLetivo;
    int idade;

    // Métodos da classe de estudante
    public void mostraInfo(){
        System.out.println();
        System.out.println("--- INFORMAÇÕES DOS ESTUDANTES---");
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Ano letivo: "+this.anoLetivo);
    }

}
