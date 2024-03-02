import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int horas = leitor.nextInt();

        System.out.print("Digite o minuto: ");
        int minutos = leitor.nextInt();

        System.out.print("Digite o segundo: ");
        int segundos = leitor.nextInt();

        System.out.println("Se passaram desde às 00:00 " + ((horas * 3600) + (minutos * 60) + segundos) + " segundos");
        leitor.close();
    }
}
