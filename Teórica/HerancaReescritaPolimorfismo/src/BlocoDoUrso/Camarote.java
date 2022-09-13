package BlocoDoUrso;

public class Camarote extends Ingresso {
    private String tamanhoCamiseta;

    public String getTamanhoCamiseta() {
        return tamanhoCamiseta;
    }

    public void setTamanhoCamiseta(String tamanhoCamiseta) {
        this.tamanhoCamiseta = tamanhoCamiseta;
    }

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Tamanho Camiseta: "+tamanhoCamiseta);
    }
}
