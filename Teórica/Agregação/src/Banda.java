import java.sql.SQLOutput;

public class Banda {

    //construtor da classe
    Banda(String name, String gen, Empresario e, Musico[] m, Musica[] mu)
    {
        nome= name;
        genero= gen;
        emp = e;
        musicos= m;
        musicas=mu;
    }

    // Atributos explicitos
    public String nome;
    public String genero;

    //Atributo implicitos1
    public Empresario emp;
    public Musico[] musicos;
    public Musica[] musicas;


    public void mostraInfosBanda()
    {
        System.out.println("Nome da banda: "+nome);
        System.out.println("Genero: "+genero);

        if (emp!=null)
        {
            System.out.println("Dados do Empresário:");
            System.out.println("Nome: "+emp.nome);
            System.out.println("Cnpj: "+emp.cnpj);

        }

        System.out.println("MUSICOS DA BANDA");
        for (int i = 0; i < musicos.length; i++)
        {
            if (musicos[i]!=null)
            {
                System.out.println("Musico: "+musicos[i].nome);
                System.out.println("Função: "+musicos[i].funcao);
                System.out.println("----------------");
            }
        }

        System.out.println("MÚSICAS DA BANDA");
        for (int i = 0; i < musicas.length; i++)
        {
            if (musicas[i]!=null)
            {
                System.out.println("Musica: "+musicas[i].nome);
                System.out.println("Tempo: "+musicas[i].tempo);
                System.out.println("----------------");
            }
        }

    }

}
