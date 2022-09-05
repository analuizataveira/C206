package Inatel;

public class Professor extends Funcionario {
    //Materia ministrada
   private String materia;

   //Método
    public void corrigirProvas(){
        System.out.println(this.getNome()+ " esta corrigindo as provas");

    }

    public void mostraInfo() {
        System.out.println();
        System.out.println("Informações do professor");
        super.mostraInfo();
        System.out.println("Especialidade: "+this.getMateria());
        System.out.println();
    }

    @Override
    public void executaAcao() {
        System.out.println(this.getNome()+ " esta dando aulas");

    }

    @Override
    public double salarioBonus() {
        return this.getSalario()+700;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia= materia;
    }
}
