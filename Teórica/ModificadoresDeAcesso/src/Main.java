public class Main {
    //  ENCAPSULAMENTO DE DADOS : proteger o dados contro o acesso direto, colocar private
    //modificadores de acesso, controlam o acesso a atributos e metodos, nas linguagens mais populares
    //MODIFICADORES DE ACESSO = PUBLIC E PRIVATE
    //tudo que eh public, chamamos de interface (frontend). Ja tudo que é private chamamos de implementacoes (backennd)
    public static void main(String[] args) {

        //CRIANDO UMA CONTA
        Conta c1 = new Conta(1212, 23.3f, "Anna Clara");

        //SACANDO DINHEIRO DA CONTA
        c1.sacar(233);


        //ACESSANDO DIRETAMENTE O SALDO
        c1.saldo= -10000;

        System.out.println(c1.saldo);


    }

}