import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a Nota 01: ");
        int nota_um = leitor.nextInt();

        System.out.print("Digite a Nota 02: ");
        int nota_dois = leitor.nextInt();

        System.out.print("Digite a Nota 03: ");
        int nota_tres = leitor.nextInt();

        double media = ((nota_um * 2) + (nota_dois * 3) + (nota_tres * 5))/(2+3+5);
        System.out.println("A média é: " + media);
        leitor.close();
    }
}
