public class ClassePrincipal {

        public static void main(String[] args) {
            //para se criar um objeto dentro da memoria- usa-se a palavra new
            //para acessar esse objeto, deve-se criar um ponteiro para ele

            AnimalPet p1 =  new AnimalPet();
            p1.nome = "Cadu";
            p1.especie = "Cachorro";
            p1.som= "Latido";
            p1.comida = "Racao";
            p1.idade = 1;

            AnimalPet p2 =  new AnimalPet();
            p2.nome = "Lola";
            p2.especie = "Gato";
            p2.som= "Miado";
            p2.comida = "Racao";
            p2.idade = 2;

            AnimalPet p3 =  new AnimalPet();
            p3.nome = "Joao Gomes";
            p3.especie = "Galo";
            p3.som= "Cocorico";
            p3.comida = "Milho";
            p3.idade = 3;

            p1.comer();
            p2.dormir();
            p3.movimentar();
        }

}
