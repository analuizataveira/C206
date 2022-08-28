import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora c1 = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com os números a serem calculados");
        c1.num1 = entrada.nextDouble();
        c1.num2 = entrada.nextDouble();


        c1.soma();
        c1.subtracao();
        c1.divisao();
        c1.multiplicacao();
        c1.exponencial();
    }
}
