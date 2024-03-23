import java.util.Scanner;

public class Exercicio27 {
    static Scanner leitor;

    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }
	public static void entradaFechar(){
        leitor.close();
    }

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return leitor.nextInt();
    }
    public static float entradaDouble(String mensagem){
        System.out.print(mensagem);
        return leitor.nextFloat();
    }


    public static void main(String[] args) {
        double imc, peso, altura;
        entradaAbrir();

        peso = entradaInt("Peso: ");
        altura = entradaDouble("Altura: ");

        entradaFechar();

        imc = peso/Math.pow(altura, 2);

        System.out.printf("IMC: %.2f%n",  imc);
    }   
}
