public class Main {

    public static void main(String[] args) {

        Notebook n1 = new Notebook();
        n1.setArmazenamento(256);
        n1.setGpu("Intel");
        n1.setProcessador("i5");
        n1.setPreco("5.000");
        n1.setNome("Notebook Acer Nitro 5");


        Camiseta c1 = new Camiseta();
        c1.setNome("Camiseta de time");
        c1.setPreco("150");
        c1.setTamanho("G");
        c1.setCor("Preto e vermelho");


        Produto[] produtos = new Produto[10];

        produtos[0] = n1;
        produtos[1] = c1;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i] instanceof Notebook) {
                    // Casting para professor
                    Notebook auxNotebook = (Notebook) produtos[i];
                    auxNotebook.etiquetaPreco();
                }
                else if (produtos[i] instanceof Camiseta) {
                    // Casting para arquiteto
                    Camiseta auxCamiseta = (Camiseta) produtos[i];
                    auxCamiseta.etiquetaPreco();

                }


            }
        }
    }
}