import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {
        /*
        CARACTERISTICAS IMPORTANTES DE UM ARRAY
        1. Tem tamanho pre-definido
        2. Guarda elementos homogêneos
        3. É declarado como um objeto
         */

        /*
        DECLARANDO O ARRAY
        Duas partes:
        Parte 1 - Criando como se fosse um objeto
        Párte 2- Criando um ponteiro
         */

        int [] numeros = new int[10];
        numeros[1]=1;
        numeros[2]=2;

        /*
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        */

        //Criando um "Array de objetos"
        Conta[] contas = new Conta[10];

        //Criando contas
        Conta c1 = new Conta();
        c1.numero=77;

        Conta c2 = new Conta();
        c2.numero = 88;


        /* Aqui estamos pedindo para que cada possicao do nosso Array
        aponte para um objeto diferente */
        contas[0] =c1;
        contas[1] =c2;
        contas[2] = new Conta();
        contas[2].numero = 99;
        for (Conta aux: contas)
        {
         if(aux != null){
             System.out.println(aux.numero);
         }
        }

    }

}
