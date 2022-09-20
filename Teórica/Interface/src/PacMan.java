public class PacMan extends Personagem
{
    private int pontuacao;
    private int vidas;

    public void perdeVida()
    {
        vidas--;
    }


    public void ganhaPonto()
    {
        pontuacao++;
    }

}
