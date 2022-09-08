package JavaZoo;

public class Coruja extends Animal{

    private int alturaVoo;

    public int getAlturaVoo() {
        return alturaVoo;
    }

    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }

    @Override
    public void fazBarulho() {
        System.out.println("Pruu Pruuu");
    }



}
