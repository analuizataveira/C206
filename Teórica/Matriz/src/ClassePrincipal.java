import java.util.Random;
import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        int linha = 0;
        int coluna = 0;
        int pontos = 0;

        //criando a matriz
        int[][] matriz = new int [3][3];

        //Selecionando aleatóriamente uma posição da matriz
        Random numAleatorio = new Random();
        linha = numAleatorio.nextInt(2);
        coluna = numAleatorio.nextInt(2);

        //posição da matriz recebendo a bomba
        matriz[linha][coluna] = 1;

        System.out.println("CAMPO MINADO");
        Scanner teclado = new Scanner(System.in);


        do
        {
            System.out.println("Entre com a linha");
            linha = teclado.nextInt();

            System.out.println("Entre com a coluna");
            coluna = teclado.nextInt();

            if(matriz[linha][coluna]==1)
            {
                System.out.println("GAME OVER");
                break;
            }

            else {
                pontos++;
                System.out.println("GREAT JOB");
            }

        } while(pontos<8);

        if(pontos==8)
        {
            System.out.println("CONGRATS! YOU WON");
        }

    }


}
