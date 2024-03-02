import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor total das vendas de vaiculos: ");
        float total_vendas = leitor.nextFloat();

        System.out.print("Valor do salario fixo: ");
        float salario_fixo = leitor.nextFloat();

        leitor.close();

        System.out.println("Valor do salario variavel: R$" + (float)(salario_fixo + (total_vendas*0.05)));
    }
}