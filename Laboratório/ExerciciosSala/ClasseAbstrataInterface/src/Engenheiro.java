public class Engenheiro extends Funcionario implements GerenciarProjetos{
    private String ramo;

    @Override
    public void mostrarInfos(){
        System.out.println();
        System.out.println("Informações do Engenheiro");
        super.mostrarInfos();
        System.out.println("Ramo: "+this.ramo);
        System.out.println();
    }

    @Override
    public void executaAcao(){
        System.out.println(this.getNome()+" Está programando");
    }

    @Override
    public void gerenciar() {
        System.out.println(this.getNome()+ " Gerenciou o projeto Y");
    }

    @Override
    public double salarioBonus(){
        return this.getSalario()+1400;
    }

    // Getters and setters
    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }


}
