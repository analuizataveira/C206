package Inatel;

public class Main {

    public static void main(String[] args) {
        //Criando objetos de funcionario
      Funcionario f1 = new Funcionario();
      Funcionario f2= new Funcionario();
      f1.setNome("Ana");
      f2.setNome("João");



        Funcionario.setCont(4000);


        System.out.println("Quanitdade de funcionários da minha empresa: "+Funcionario.getId());
        f1.mostraInfo();
        f2.mostraInfo();

    }



}
