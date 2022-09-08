package JavaZoo;

public class Main {

    public static void main(String[] args) {

        Coruja c1 = new Coruja();
        c1.nome = "Corjutia";
        c1.nPatas = 2;
        c1.cor = "Marrom";
        c1.setAlturaVoo(10);


        Pato p1 = new Pato();
        p1.nome = "Patolino";
        p1.cor = "Branco";
        p1.setTamanhoBico(29.0f);


        Peixe px1 = new Peixe();
        px1.nome = "Peixonauta";
        px1.cor = "Azul";
        px1.setnBarbatanas(2);

        Leao l1 = new Leao();
        l1.nome = "Simba";
        l1.cor = "Bege";
        l1.setTamanhoJuba(2);

        Zoologico zoo = new Zoologico();
        zoo.setNome("Zoolandia");
        zoo.setEndereco("Rua Leao Coruja 300");

        zoo.bixo[0]= c1;
        zoo.bixo[1]= p1;
        zoo.bixo[2]= l1;
        zoo.bixo[3]= px1;

        c1.fazBarulho();
        p1.fazBarulho();
        px1.fazBarulho();
        l1.fazBarulho();


        
    }
}
