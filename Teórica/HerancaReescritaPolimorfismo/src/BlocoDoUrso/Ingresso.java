package BlocoDoUrso;

import java.util.Date;

public class Ingresso {

    static private long numberGenerator;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao;
    protected Date dataHoraCompra;


    Ingresso(){

        //GERANDO VALORES DE INGRESSO
        numberGenerator++;
        numero  = numberGenerator;


        //Terminando de declarar date
        dataHoraCompra = new Date();

    }


    public float calculaTotalIngresso()
    {
       return valorIngresso + taxaCartao;
    }



    public void mostraInfos()
    {
        System.out.println("Número: "+numero);
        System.out.println("Total: "+calculaTotalIngresso());
        System.out.println("Data Hora Compra: "+dataHoraCompra);
    }


}
