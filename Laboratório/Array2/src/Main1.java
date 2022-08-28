import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Escola escola = new Escola("Escola do Paulo", "Escola do Paulo", 565, "Rua da Alegria");


        boolean flag = true; //flag de controle do while

        while (flag = true) {
            System.out.println("-- BEM VINDO " + escola.nome);
            System.out.println("1- Cadastrar estudantes");
            System.out.println("2- Mostrar informações dos estudantes");
            System.out.println("3- Mostrar quantidade de estudantes por ano");
            System.out.println("4- Sair do sistema");


            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Estudante e = new Estudante();
                    sc.nextLine();
                    System.out.println("Nome do aluno: ");
                    e.nome = sc.nextLine();
                    System.out.println("Idade do aluno: ");
                    e.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ano letivo: ");
                    e.anoLetivo = sc.nextLine();
                    escola.addEstudante(e);
                    break;

                case 2:
                    escola.mostraInfos();
                    break;

                case 3:
                    escola.qtdEstudantesPorAno();
                    break;

                case 4:
                    flag = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }
        }

        sc.close();

    }

}

