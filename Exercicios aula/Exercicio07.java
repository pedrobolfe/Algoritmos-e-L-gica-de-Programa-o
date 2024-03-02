import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do raio de uma circunferencia: ");
        int raio = leitor.nextInt();

        System.out.println("Perimetro: " + (double)(raio * 3.14f * 2));
        System.out.println("Area: " + (double)(raio * raio * 3.14f));
        leitor.close();
    }    
}