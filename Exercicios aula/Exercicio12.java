import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade de votos do candidato C1: ");
        int votos_c1 = leitor.nextInt();

        System.out.print("Insira a quantidade de votos do candidato C2: ");
        int votos_c2 = leitor.nextInt();

        System.out.print("Insira a quantidade de votos do candidato C3: ");
        int votos_c3 = leitor.nextInt();

        System.out.print("insira a quantidade de votos brancos: ");
        int qnt_brancos = leitor.nextInt();

        System.out.print("Insira a quantidade de votos nulos: ");
        int qnt_nulos = leitor.nextInt();

        leitor.close();

        int total_votos = (votos_c1 + votos_c2 + votos_c3 + qnt_brancos + qnt_nulos);
        System.out.println("O total de votos é: " + total_votos);

        double porct_brancos = (qnt_brancos*100)/total_votos;
        double porct_nulos = (qnt_nulos*100)/total_votos;

        System.out.println("A porcentagem de votos brancos é: " + porct_brancos);
        System.out.println("A porcentagem de votos nulos é: " + porct_nulos);
    }
}