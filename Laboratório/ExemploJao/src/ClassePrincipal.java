public class ClassePrincipal {

    public static void main(String[] args) {

        // Fazendo uma composição
        /*Produto p1 = null;
        System.out.println(p1);
        p1 = new Produto("Teste", 10, "123456AB", 10);
        System.out.println(p1);
        */

        // Fazendo uma agregação
        Arma arma1 = new Arma();
        //System.out.println(arma1);

        Arma arma2 = new Arma("Branca", 20);
        Nave nave1 = new Nave("Avião", arma1);
        //System.out.println(nave1.arma.tipo);

        System.out.println(arma1);
        System.out.println(nave1.arma);
        nave1.addArma(arma2);
        System.out.println(arma2);
        System.out.println(nave1.arma);

        //System.out.println(nave1.arma.tipo);
    }
}
