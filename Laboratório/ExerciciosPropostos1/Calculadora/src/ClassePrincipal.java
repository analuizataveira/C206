import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        float resultado = 0f;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com os numeros: ");
        float num1 = entrada.nextFloat();
        float num2 = entrada.nextFloat();

        entrada.nextLine();
        System.out.println("Entre com o tipo de operação: ");
        String operacao = entrada.nextLine();

        if (operacao.equals("+")) {
            resultado = num1+num2;
        }

        else{

            if (operacao.equals("-")) {
                resultado = num1-num2;
            }

            if (operacao.equals("x")){
                resultado = num1*num2;
            }

            if(operacao.equals("/")) {
                resultado = num1/num2;
            }

        }

        System.out.println(resultado);

        }


    }
