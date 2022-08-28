public class Main {
    public static void main(String[] args) {

        Carro car1=new Carro("Vermelho","AirCross 2021","Citroen",60,280);
        Motor mot1=new Motor();
        mot1.potencia=350;
        mot1.tipo="1.6";
        car1.motor=mot1;

        Carro car2 = new Carro("Branco","Toro 2018","Fiat",100,300);
        Motor mot2 = new Motor();
        mot2.potencia=400;
        mot2.tipo="2.0";
        car2.motor=mot2;


        car1.mostraInfo();
        car2.mostraInfo();

        car1.ligar();
        car2.ligar();

        car1.acelerar();
        car2.acelerar();

    }

}


