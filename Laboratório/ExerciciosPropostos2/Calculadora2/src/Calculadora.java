import static java.lang.Math.pow;

public class Calculadora {

    double num1;
    double num2;

    public void soma(){
        double soma=num1+num2;
        System.out.println("Soma: " +soma);
    }
    public void subtracao(){
        double sub=num1-num2;
        System.out.println("Subtração: "+sub);
    }
    public void multiplicacao(){
        double mult=num1*num2;
        System.out.println("Multiplicação: "+mult);
    }
    public void divisao() {
        double div= num1/num2;
        System.out.println("Divisão: "+div);
    }
    public void exponencial(){
        double exp=pow(num1,num2);
        System.out.println("Exponencial: "+exp);
    }


}
