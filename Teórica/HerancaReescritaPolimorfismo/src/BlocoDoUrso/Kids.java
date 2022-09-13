package BlocoDoUrso;

public class Kids extends VIP{
    private String docResponsavel;

    public String getDocResponsavel() {
        return docResponsavel;
    }

    public void setDocResponsavel(String docResponsavel) {
        this.docResponsavel = docResponsavel;
    }

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Documento Responsável: "+docResponsavel);
    }
}
