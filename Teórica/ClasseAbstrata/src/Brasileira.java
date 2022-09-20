public class Brasileira extends Pizza{


    @Override
    public void mostraIngredientes() {
        System.out.println("---Ingredientes---");
        System.out.println("Mussarela");
        System.out.println("Requeijão");
        System.out.println("Presunto");
        System.out.println("Azeitona");
    }

    @Override
    public String mostraBrinde() {
        return "Chaveiro";
    }
}
