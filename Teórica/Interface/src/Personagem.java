public abstract class Personagem implements Movel
{

    protected String cor;
    protected int posicaoX;
    protected int posicaoY;


    @Override
    public void moverPraCima() {
        posicaoY++;
    }

    @Override
    public void moverPraBaixo() {
        posicaoY--;
    }

    @Override
    public void moverPraEsquerda() {
        posicaoX--;
    }

    @Override
    public void moverPraDireita() {
        posicaoX++;
    }

}
