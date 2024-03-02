import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a distância em km: ");
        int qnt_km = leitor.nextInt();

        System.out.print("Digite por quantos dias o carro foi alugado: ");
        int qnt_dias = leitor.nextInt();

        System.out.println("o total a pagar é R$" + ((qnt_km * 0.15) + (qnt_dias*60)));

        leitor.close();
    }
}
