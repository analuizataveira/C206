public class Pepperoni extends Pizza {
    @Override
    public void mostraIngredientes() {
        System.out.println("---Ingredientes---");
        System.out.println("Pepperoni");
        System.out.println("Mussarela");

    }

    @Override
    public String mostraBrinde() {
        return "Chaveiro";
    }
}
