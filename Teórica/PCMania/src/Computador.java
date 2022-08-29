public class Computador {

    //Atributos
    String marca;
    Float preco;

    //Agregação
     public MemoriaUSB memoria;
     Cliente[] cliente = new Cliente[10];

    //Composição
    public SistemaOperacional SO = new SistemaOperacional();
    public HardwareBasico HB = new HardwareBasico();


    //Construtor


    public Computador(String marca, float preco, String nomeSO, int tipoSO, String nomeHB, float capacidadeHB,MemoriaUSB memoria) {
        this.marca = marca;
        this.preco = preco;
        this.SO.nome = nomeSO;
        this.SO.tipo = tipoSO;
        this.HB.nome = nomeHB;
        this.HB.capacidade = capacidadeHB;
        this.memoria=memoria;
    }

    //Métodos
    public void mostraPCConfigs()
    {
        System.out.println("--- INFORMAÇÕES SOBRE COMPUTADOR ---");
        System.out.println("Marca: "+marca);
        System.out.println("Preço: "+preco);
        System.out.println("---- Memoria USB: ------ ");
        System.out.println("Nome: "+memoria.nome);
        System.out.println("Capacidade: "+memoria.capacidade);
        System.out.println("---Sistema Operacional---");
        System.out.println("Nome: "+SO.nome);
        System.out.println("Tipo: "+SO.tipo);
        System.out.println("---HARDWARE BÁSICO---");
        System.out.println("Nome: "+HB.nome);
        System.out.println("Capacidade: "+HB.capacidade);

    }

    public void addMemoriaUSB(MemoriaUSB memoria)
    {
      this.memoria = memoria;

    }

}