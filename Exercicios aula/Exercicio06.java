import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da base do retangulo: ");
        int base = leitor.nextInt();

        System.out.print("Digite o valor da altura do retangulo: ");
        int altura = leitor.nextInt();

        System.out.println("o perimetro do retangulo é: " + (2 * (base + altura)) + " cm");
        System.out.println("A area do retangulo é: " + (base * altura) + " cm quadrados");
        leitor.close();
    }
}