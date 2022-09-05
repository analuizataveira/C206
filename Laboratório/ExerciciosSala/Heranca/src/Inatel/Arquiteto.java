package Inatel;

public class Arquiteto extends Funcionario{

   private String especialidade;

    @Override
    public void mostraInfo() {
        System.out.println();
        System.out.println("Informações do arquiteto");
        super.mostraInfo();
        System.out.println("Especialidade: "+this.getEspecialidade());
        System.out.println();
    }

    public void executaAcao() {
        System.out.println(this.getNome()+ " esta projetando um novo projeto de design de interiores");

    }

    @Override
    public double salarioBonus() {
        return this.getSalario()+500;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

