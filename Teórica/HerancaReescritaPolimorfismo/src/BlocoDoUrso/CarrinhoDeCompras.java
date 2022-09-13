package BlocoDoUrso;

public class CarrinhoDeCompras {

    private String loginCliente;


    private Ingresso [] ingressos = new Ingresso[50];


    public String getLoginCliente() {

        return loginCliente;
    }

    public void setLoginCliente(String loginCliente) {

        this.loginCliente = loginCliente;
    }


    public void addIngresso (Ingresso ing)
    {
        for (int i = 0; i < ingressos.length; i++)
        {

            if (ingressos[i] == null)
            {
                ingressos[i] = ing;
                break;

            }

        }
    }


    public void mostraDetalhesCompras()
    {
        //For para mostar dados de todos os ingressos comprados
        for (int i = 0; i < ingressos.length; i++)
        {
            if (ingressos[i]!= null)
            {
                System.out.println(ingressos[i].ingremostraInfos());
                System.out.println(ingressos[i].);
            }

        }

    }

}
