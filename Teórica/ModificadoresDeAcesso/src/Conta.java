public class Conta
{
    //ATRIBUTOS DA CONTA

    private int numero;
    private float saldo;
    private String proprietario;

    public Conta(int numero, float saldo, String proprietario) {
        this.numero = numero;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    //METODOS DAS CONTA
    public void sacar(float valor)
    {
        //CONTROLANDO MELHOR A OPERACAO DE SAQUE
        if(valor<=this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado!");
            System.out.println("Novo saldo: " +this.saldo);
        }
        else
        {
            System.out.println("Saldo insuficiente!");
        }
    }

    //get = pegar
    //set = setar

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}