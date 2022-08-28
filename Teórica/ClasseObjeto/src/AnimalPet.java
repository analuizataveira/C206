public class AnimalPet {
    String nome;
    String especie;
    String som;
    String comida;
    int idade;

    void comer()
    {
        System.out.println("O(A) "+nome+ " esta comendo");
    }

    void dormir()
    {
        int horas=3;
        System.out.println("O(A) "+nome+ " esta dormindo a "+horas+ " horas");
    }

    void movimentar()
    {
    int metros=2;
        System.out.println("O(A) "+nome+ "correu "+metros+ " metros");
    }

    void fazerBarulho()
    {
        System.out.println("O(A) "+nome+ " fez barulho");
    }


}
