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
            if(arvores[i] != null ){
                if(arvores[i].altura >= 50 && arvores[i].diametro >= 3){
                    System.out.println("A arvore da especie "+ arvores[i].especie + " ja deve ser replantada");
                }
            }
        }
    }

    void precoMedio() {
        int medioPreco = 0;
        int contadorArvores = 0;

        for (int i = 0; i < arvores.length; i++) {
            // comparacao das posicoes para verificar se existe uma arvore cadastrada
            if(arvores[i] != null ){
                medioPreco = (int) (arvores[i].preco + medioPreco);
                contadorArvores++;
            }
        }
        System.out.println(" O preco medio das arvores do jardim é de: "+ medioPreco/contadorArvores);
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
        }

    }
}




