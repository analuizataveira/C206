package BlocoDoUrso;

public class VIP extends Ingresso{
    protected String tamanhoAbada;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Tamanho Abada: "+tamanhoAbada);
    }
}
