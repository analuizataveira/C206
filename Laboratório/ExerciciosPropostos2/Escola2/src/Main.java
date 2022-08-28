import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     //Notas dos alunos e media
     float np1 =0;
     float np2 =0;
     float media=0f;

    //Entrada de dados
     Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com as notas dos alunos: ");
        np1 = entrada.nextFloat();
        np2 = entrada.nextFloat();

        media = (np1+np2)/2;

        System.out.println("Media dos alunos: "+media);

    }


}
