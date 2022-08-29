import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente("Ana Luiza", 1068057063);

        //Criando array para armazenar quais computadores foram comprados
        Computador [] compras = new Computador[10];

        //Criando computadores
        MemoriaUSB m1 = new MemoriaUSB("Pen Drive",16);
        Computador pc1 = new Computador("Positivo", 1300, "Linux", 32, "Pentium Core i3", 1200, m1);

        MemoriaUSB m2 = new MemoriaUSB("Pen Drive",32);
        Computador pc2 = new Computador("Acer", 1800, "Windows 8", 64, "Pentium Core i5", 2260, m2);

        MemoriaUSB m3 = new MemoriaUSB("HD externo", 10000);
        Computador pc3 = new Computador("Vaio", 2800, "Windows 10", 64, "Pentium Core i7", 3500, m3);


        System.out.println("-- BEM VINDO A LOJA DA ANA---");
        System.out.println("SELECIONE 1 2 OU 3 PARA SELECIONAR O COMPUTADOR QUE DESEJA ADQUIRIR");
        System.out.println("CASO QUEIRA SAIR DO MENU, DIGITE 0");
        System.out.println();
        System.out.println("---PROMOÇÃO 1---");
        pc1.mostraPCConfigs();
        System.out.println();
        System.out.println("--PROMOÇÃO 2---");
        pc2.mostraPCConfigs();
        System.out.println();
        System.out.println("---PROMOÇÃO 3---");
        pc3.mostraPCConfigs();

        int opcao = entrada.nextInt();
        entrada.nextLine();

        float totalCompra=0;
        int j=0;

        while(opcao != 0) {

            switch(opcao){
                case 1:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, pc1.preco);
                    compras[j] = pc1;
                    j++;
                    break;

                case 2:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, pc2.preco);
                    compras[j] = pc2;
                    j++;
                    break;

                case 3:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, pc3.preco);
                    compras[j] = pc3;
                    j++;
                    break;


                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("CASO QUEIRA ADQUIRIR MAIS ALGUM COMPUTADOR, DIGITE A OPÇÃO DESEJADA");
            opcao = entrada.nextInt();

        }

        System.out.println("Nome do cliente: "+ cliente.nome);
        System.out.println("CPF do cliente: "+ cliente.cpf);
        System.out.println();
        System.out.println("Computadores comprados:");
        System.out.println();
        for (int i = 0; i < compras.length; i++) {
            if(compras[i]!= null)
            {
                compras[i].mostraPCConfigs();
                System.out.println();
            }
            else break;
        }
        System.out.println("Total da Compra: R$"+totalCompra);

    }

}


