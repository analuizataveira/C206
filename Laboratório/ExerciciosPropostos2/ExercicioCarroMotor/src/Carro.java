public class Carro {

        //Atributos do carro
        String cor;
        String modelo;

        String marca;
        double velocidadeMax;
        double velocidadeAtual;

        //Composição
        //Todo carro precisa ter um motor, dessa forma, é preciso criar um objeto motor dentro do carro
        Motor motor = new Motor();


    // Construtor
        public Carro(String cor,String modelo,String marca, double velocidadeAtual,double velocidadeMax)
        {
        this.cor=cor;
        this.modelo=modelo;
        this.marca=marca;
        this.velocidadeAtual=velocidadeAtual;
        this.velocidadeMax= velocidadeMax;
        }

         public void ligar(){
            System.out.println("O carro "+modelo+" da marca "+marca+" está ligado");
        }

        public void acelerar(){
            System.out.println("O carro "+modelo+ " da marca "+marca+" acelerou");
        }

        public void mostraInfo(){
            System.out.println("------INFORMAÇÕES SOBRE O CARRO-----");
            System.out.println("Cor: "+cor);
            System.out.println("Marca: "+marca);
            System.out.println("Velocidade máxima: "+velocidadeMax);
            System.out.println("Velocidade atual: "+velocidadeAtual);
        }

    }


