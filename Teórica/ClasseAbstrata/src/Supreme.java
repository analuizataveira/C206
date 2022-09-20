public class Supreme extends Pizza {
    @Override
    public void mostraIngredientes() {
        System.out.println("---Ingredientes---");
        System.out.println("Mussarela");
        System.out.println("Cebola");
        System.out.println("Pimentão");
        System.out.println("Azeitona");
    }

    @Override
    public String mostraBrinde() {
        return "Caneca";
    }
}
