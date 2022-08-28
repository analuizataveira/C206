import java.sql.SQLOutput;

public class ClassePrincipal {

    public static void main(String[] args) {
        //para se criar um objeto dentro da memoria- usa-se a palavra new
        //para acessar esse objeto, deve-se criar um ponteiro para ele

        TrabalhadorBrasileiro p1 =  new TrabalhadorBrasileiro();
        p1.nome = "Ana Luiza";
        p1.profissao = "Engenheira";
        p1.rg= "20.639.543";
        p1.dataNascimento= "08/07/2002";
        p1.salario= 500f;

        TrabalhadorBrasileiro p2 =  new TrabalhadorBrasileiro();
        p2.nome = "Clara";
        p2.profissao = "Medica";
        p2.rg= "20.039.543";
        p2.dataNascimento= "08/07/2002";
        p2.salario= 1200f;


        p1.mostraInfosFuncionario();
        p1.receberAumento(400);
        p2.mostraInfosFuncionario();
        System.out.println("Ganho anual: "+p2.calculaGanhoAnual());



    }



}
