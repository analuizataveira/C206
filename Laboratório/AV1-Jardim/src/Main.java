import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jardim jardim = new Jardim("Ana", "99902-2938", "Rua Antonio Americo Junqueira 327");

        boolean flag = true; //flag de controle do while

        while (flag = true) {
            System.out.println("Selecione a opção desejada");
            System.out.println("1- Cadastrar arvore");
            System.out.println("2- Mostrar informações");
            System.out.println("3- Verificar qual arvore precisa ser replantada");
            System.out.println("4- Preço médio das plantas cadastradas");
            System.out.println("5- Sair do sistema");

            int opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    Arvore arvore = new Arvore();
                    sc.nextLine();
                    System.out.println("Especie da árvore: ");
                    arvore.especie = sc.nextLine();
                    System.out.println("Altura da arvore: ");
                    arvore.altura = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Diâmetro da árvore: ");
                    arvore.diametro = sc.nextFloat();
                    System.out.println("Preço da árvore: ");
                    arvore.preco = sc.nextFloat();
                    jardim.addArvore(arvore);
                    break;

                case 2:
                    jardim.mostraInfo();
                    break;

                case 3:
                    jardim.replantar();
                    break;

                case 4:
                    jardim.precoMedio();

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }

        }

    }

}
