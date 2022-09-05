package Inatel;

public class Funcionario {

    private String nome;
    private static int id;
    private static int cont=0;

    public Funcionario(){
    cont++;
    this.id= cont;
    }


    public void mostraInfo(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Id: "+this.id);
    }


    /////GET////
    public String getNome() {
        return nome;
    }

    public static int getCont(){
        return cont;

    }
    public static int getId() {
        return id;
    }


    ////SET/////
    public static void setCont(int valor){
        cont = valor;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
