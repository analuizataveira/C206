public class ClassePrincipal {

    public static void main(String[] args) {
        //para se criar um objeto dentro da memoria- usa-se a palavra new
        //para acessar esse objeto, deve-se criar um ponteiro para ele

        Pessoa p1 =  new Pessoa();
        p1.nome = "Diego";
        p1.idade = 19;
        p1.cpf= "12.345.678-9";

        Pessoa p2 = new Pessoa();
        p2.nome = "Isac";
        p2.idade = 19;
        p2.cpf= "12.345.688-9";

        Pessoa p3 = new Pessoa();
        p3.nome = "Maria Luiza";
        p3.idade = 20;
        p3.cpf= "13.345.688-9";

        p1.comer();
        p2.dormir();
        p3.tomarAgua();

    }

}
