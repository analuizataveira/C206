package JavaZoo;

public class Leao extends Animal{

private float tamanhoJuba;

    @Override
    public void fazBarulho() {
        System.out.println("Roar!");
    }

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }
}
