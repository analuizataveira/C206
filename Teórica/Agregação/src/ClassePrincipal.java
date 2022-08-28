public class ClassePrincipal {

    public static void main(String[] args) {
        Musico mu1 = new Musico();
        mu1.nome = "Joelma";
        mu1.funcao = "Vocalista";

        Musico mu2 = new Musico();
        mu2.nome = "Chimbinha";
        mu2.funcao = "Guitarrista";

        Musico[] musicos = new Musico[50];
        musicos[0]= mu1;
        musicos[1]= mu2;


        Musica music1 = new Musica();
        music1.nome = "A lua me traiu";
        music1.tempo = "3:00";

        Musica music2 = new Musica();
        music2.nome = "Vendaval";
        music2.tempo = "3:30";

        Musica[] musicas = new Musica[50];
        musicas[0]= music1;
        musicas[1]= music2;

        Banda banda1 = new Banda("Calypso", "Axé", null, musicos, musicas);
        banda1.mostraInfosBanda();

        

    }


}


