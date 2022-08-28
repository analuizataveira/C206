public class Jardim {

    //Atributos
    String nomeDono;
    String contato;
    String endereco;

    //Composição
    Arvore[] arvores = new Arvore[10];

    public Jardim(String nomeDono, String contato, String endereco) {
        this.nomeDono = nomeDono;
        this.contato = contato;
        this.endereco = endereco;
    }

    //Métodos
    void addArvore(Arvore arvore) {
        for (int i = 0; i < this.arvores.length; i++) {

            // Comparando as posições para verificar se nao existe nenhuma arvore
            if (arvores[i] == null) {
                arvores[i] = arvore;
                break;
            }

        }

    }

    void replantar() {

        for (int i = 0; i < arvores.length; i++) {
            if (arvores[i].altura > 50 && arvores[i].diametro >= 3) {
                System.out.println("A árvore da espécie " + arvores[i].especie + " deve ser replatada");
            } else {
                System.out.println("Arvore não precisa ser replantada");
            }
        }
    }

    void precoMedio() {
        float media = 0f;

        for (int i = 0; i < arvores.length; i++) {
            media += arvores[i].preco / i;
            System.out.println(media);
        }

    }


    void mostraInfo() {
        System.out.println();
        System.out.println("--- INFORMAÇÕES DO DONO---");
        System.out.println("Nome do dono " + this.nomeDono);
        System.out.println("Contato do dono: " + this.contato);
        System.out.println("Endereço da dono: " + this.endereco);
        System.out.println();

        for (int i = 0; i < arvores.length; i++) {

            if (arvores[i] != null) {
                System.out.println("---INFORMAÇÕES DA ÁRVORE---");
                System.out.println("Especie da arvore comprada: " + arvores[i].especie);
                System.out.println("Altura da arvore comprada: " + arvores[i].altura);
                System.out.println("Diametro da arvore comprada: " + arvores[i].diametro);
                System.out.println("Preço da arvore comprada: " + arvores[i].preco);

            }
            break;
        }

    }
}




