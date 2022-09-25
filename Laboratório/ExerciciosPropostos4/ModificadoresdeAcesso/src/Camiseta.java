public class Camiseta extends Produto{

    private String cor;
    private String tamanho;

    @Override
    public void etiquetaPreco (){
        System.out.println();
        System.out.println("Informações camiseta");
        super.etiquetaPreco();
        System.out.println("Cor: "+this.cor);
        System.out.println("Tamanho: "+this.tamanho);
    }

    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
