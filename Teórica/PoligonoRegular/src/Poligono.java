public class Poligono {

    // Atributos
    private int n;
    private float c;
    private float areaPoligono;
    //Metodos
    private float calculaPerimetro(){
        return c * n;
    }

    private float calculaApotema(){
        return (float) (c / (2 * Math.tan(Math.toRadians(180/n))));
    }

    public void calculaArea(int nLados, float cLados) {
        c = cLados;
        n = nLados;
        areaPoligono = (calculaPerimetro()*calculaApotema())/2;
    }

    public float getAreaPoligono() {
        return areaPoligono;
    }


}
