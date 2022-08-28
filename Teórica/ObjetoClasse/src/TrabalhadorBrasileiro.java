public class TrabalhadorBrasileiro {

        String nome;
        String rg;
        String profissao;
        String dataNascimento;
        float salario;

        void receberAumento(float valor)
        {
            salario= salario+valor;
            System.out.println("Salario Autuailizado para "+salario);
        }

        float calculaGanhoAnual()
        {
            return salario*13;
        }

        void mostraInfosFuncionario()
        {
            System.out.println("Infos do " +nome);
            System.out.println("Profissao: "+profissao);
            System.out.println("Salario: " +salario);
            System.out.println("RG: "+rg);
            System.out.println("Data de nascimento: "+dataNascimento);
        }
}
