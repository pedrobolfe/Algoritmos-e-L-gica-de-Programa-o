import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da mercadoria: ");
        float valor_merc = leitor.nextFloat();

        System.out.print("Digite a porcentagem do desconto: ");
        int desconto = leitor.nextInt();

        System.out.println("O valor a pagar é: R$" + (double)(valor_merc - (valor_merc * desconto/100)));
        leitor.close();
    }
}
