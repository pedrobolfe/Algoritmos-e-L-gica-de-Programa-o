import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do bolerto: ");
        int val_boleto = leitor.nextInt();

        System.out.print("Digite o percentual de juros: ");
        int porct_juros = leitor.nextInt();

        System.out.print("Quantidade de dias em atraso do boleto: ");
        int qnt_dias = leitor.nextInt();

        System.out.println("O valor do boleto é: R$" + (double)(val_boleto + (val_boleto * (porct_juros/100) * qnt_dias)));
        leitor.close();
    }
}
