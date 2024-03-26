import java.util.Scanner;

public class Triangulo {
    static Scanner leitor;

    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }

    public static void entradaFechar(){
        leitor.close();
    }

    public static float entradaInt(String menssagem){
        System.out.print(menssagem);
        return leitor.nextFloat();
    }

    public static void main(String[] args){
        entradaAbrir();

        float lado1 = entradaInt("Digite o lado 1: ");
        float lado2 = entradaInt("Digite o lado 2: ");
        float lado3 = entradaInt("Digite o lado 3: ");

        if ((lado1 + lado2) > lado3 & (lado1 + lado3) > lado2 & (lado3 + lado2) > lado1){
            System.out.println("Os lados acima formam um triângulo");
        } else {
            System.out.println("Os lados acima não formam um triângulo");
        }
    }
}
