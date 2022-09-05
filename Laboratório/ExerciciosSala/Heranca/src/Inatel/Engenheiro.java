package Inatel;

//classe filho
public class Engenheiro extends Funcionario{

    private String ramo;

    public void mostraInfo() {
        System.out.println();
        System.out.println("Informações do engenheiro");
        super.mostraInfo();
        System.out.println("Especialidade: "+this.getRamo());
        System.out.println();
    }

    public void executaAcao() {
        System.out.println(this.getNome()+ " esta programando");

    }

    @Override
    public double salarioBonus() {
        return this.getSalario()+1500;
    }


    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}
