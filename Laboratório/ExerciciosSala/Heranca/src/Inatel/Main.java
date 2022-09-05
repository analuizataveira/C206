package Inatel;

public class Main {

    public static void main(String[] args) {

        //Criando os objetos
        Professor p1 = new Professor();
        p1.setNome("Renzo");
        p1.setIdade(40);
        p1.setSalario(5000);
        p1.setMateria("PO");

        Arquiteto a1 = new Arquiteto();
        a1.setNome("Bruno");
        a1.setIdade(30);
        a1.setSalario(2000);
        a1.setEspecialidade("Design");


        Engenheiro e1 = new Engenheiro();
        e1.setNome("Ana");
        e1.setIdade(20);
        e1.setSalario(5000);
        e1.setRamo("Software");


        p1.executaAcao();
        a1.executaAcao();
        e1.executaAcao();

        p1.salarioBonus();
        a1.salarioBonus();
        e1.salarioBonus();


        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = a1;
        funcionarios[1] = e1;
        funcionarios[2] = p1;

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                if (funcionarios[i] instanceof Professor){
                    //Casting professor
                   Professor auxProfessor = (Professor)funcionarios[i];
                   auxProfessor.mostraInfo();
                   auxProfessor.executaAcao();
                   auxProfessor.corrigirProvas();
                }
                else if(funcionarios[i] instanceof Arquiteto)
                {
                    Arquiteto auxArquiteto = (Arquiteto)funcionarios[i];
                    auxArquiteto.mostraInfo();
                    auxArquiteto.executaAcao();
                }
                else{
                    Engenheiro auxEngenheiro = (Engenheiro) funcionarios[i];
                    auxEngenheiro.mostraInfo();
                    auxEngenheiro.executaAcao();
                }
            }

        }

    }
}
