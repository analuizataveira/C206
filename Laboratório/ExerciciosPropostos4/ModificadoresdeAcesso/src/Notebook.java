public class Notebook extends Produto{

    private double armazenamento;
    private String gpu;
    private String processador;

    @Override
    public void  etiquetaPreco() {
        System.out.println();
        System.out.println("Informações do notebook");
        super.etiquetaPreco();
        System.out.println("Armazenamento: " +this.armazenamento);
        System.out.println("Gpu: " +this.gpu);
        System.out.println("Processor: " +this.processador);
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
