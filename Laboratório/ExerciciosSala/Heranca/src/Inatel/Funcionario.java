package Inatel;


//classe mãe

public class Funcionario {

    //Atributos funcionario
    private String nome;
    private int idade;
    private double salario;


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //Método
    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: " + this.salario);
    }


    public void executaAcao() {

        System.out.println("Ação do funcionário");
    }

    public double salarioBonus() {
        return this.salario;
    }

}






