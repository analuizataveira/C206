package JavaZoo;

public class Pato extends Animal{

    private float tamanhoBico;

    @Override
    public void fazBarulho() {
        System.out.println("Quack Quack");
    }

    public float getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
}
