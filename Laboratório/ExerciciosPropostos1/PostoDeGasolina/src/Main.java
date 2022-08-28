import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float litros = 0;
        float custo = 0f;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite: G para Gasolina e A para Alcool");
        String tipoCombustivel = entrada.nextLine();
        char calculo = tipoCombustivel.charAt(0);

        System.out.println("Entre com a quantidade de litros");
        litros = entrada.nextInt();


        switch (calculo) {
            case 'G':
                if (litros <= 20) {
                    double precoG;
                    precoG = litros * 5.76;
                    System.out.println("Valor total de R$" + precoG);
                } else {
                    double precoG;
                    precoG = litros * 5.64;
                    System.out.println("Valor total de R$" + precoG);
                }
                break;

            case 'A':
                if (litros <= 20) {
                    double precoA;
                    precoA = litros * 4.75;
                    System.out.println("Valor total de R$" + precoA);
                } else {
                    double precoA;
                    precoA = litros * 4.65;
                    System.out.println("Valor total de R$" + precoA);
                }
                break;
        }
    }
}
