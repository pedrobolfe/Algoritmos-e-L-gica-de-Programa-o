import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do salario: ");
        float salario = leitor.nextFloat();

        System.out.print("Digite a porcentagem do aumento: ");
        int aumento = leitor.nextInt();

        System.out.println("O valor a pagar é: R$" + (double)(salario + (salario * aumento/100)));
        leitor.close();
    }
}
