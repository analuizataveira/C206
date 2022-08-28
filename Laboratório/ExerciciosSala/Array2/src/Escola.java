public class Escola {

    //Atributos explicitos
    String nome;
    String email;
    int numTelefone;
    String endereco;

    //Array de estudantes - Atributos implicitos
    Estudante[] estudantes = new Estudante[300];  //array contendo 300 referencias para estudantes

    // Construtor da escola
    public Escola(String nomeEscola, String email, int numTelefone, String endereco) {
        this.nome = nomeEscola;
        this.email = email;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    // Métodos
    // 1- Cadastrar estudantes no sistema da escola
    public void addEstudante(Estudante e)
    {
        // Percorrendo o array de estudantes
        for (int i = 0; i < estudantes.length; i++) {

            // Comparando as posições para verificar se nao existe nenhum estudante
            if (estudantes[i] == null) {
                estudantes[i] = e; // adicionando um estudante na posicao i do meu array
                break;
            }
        }
    }

        public void mostraInfos ()
        {
            System.out.println();
            System.out.println("--- INFORMAÇÕES DA ESCOLA ---");
            System.out.println("Nome da escola: " + this.nome);
            System.out.println("Email da escola: " + this.email);
            System.out.println("Número da escola: " + this.numTelefone);
            System.out.println("Endereço da escola: " + this.endereco);

            for (int i = 0; i < estudantes.length; i++) {

                // Comparando as posições para verificar se existe um estudante
                if (estudantes[i] != null) {
                    estudantes[i].mostraInfo(); //mostrando as informacoes dos estudantes

                }
            }


        }

        public void qtdEstudantesPorAno ()
        {
            int qtdPrimeiro = 0; // conta quantidade de estudantes do primeiro ano
            int qtdSegundo = 0;
            int qtdTerceiro = 0;

            for (int i = 0; i < estudantes.length; i++) {

                // Comparando as posições para verificar se existe um estudante
                if (estudantes[i] != null) {
                    if (estudantes[i].anoLetivo.equals("PRIMEIRO"))
                    {
                        qtdPrimeiro++;
                    }

                    if(estudantes[i].anoLetivo.equals("SEGUNDO"))
                    {
                        qtdSegundo++;
                    }
                    if(estudantes[i].anoLetivo.equals("TERCEIRO"))
                    {
                        qtdTerceiro++;
                    }

                }


            }
            System.out.println("Quantidade de alunos por ano: ");
            System.out.println("Quantidade do 1º: "+qtdPrimeiro);
            System.out.println("Quantidade do 2º: "+qtdSegundo);
            System.out.println("Quantidade do 3º: "+qtdTerceiro);

        }

    }
