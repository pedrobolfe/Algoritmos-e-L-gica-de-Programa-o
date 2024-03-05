import java.util.Scanner;
public class Exercicio12 {
    static Scanner leitor;

    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }

    public static void entradaFechar(){
        leitor.close();
    }

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return leitor.nextInt();
    }

    public static void saidaString(String mensagem){
        System.out.print(mensagem);
    }

    public static void main(String[] args){
        entradaAbrir();
        
        int votos_c1 = entradaInt("Insira a quantidade de votos do candidato C1: ");
        int votos_c2 = entradaInt("Insira a quantidade de votos do candidato C2: ");
        int votos_c3 = entradaInt("Insira a quantidade de votos do candidato C3: ");
        int qnt_brancos = entradaInt("insira a quantidade de votos brancos: ");
        int qnt_nulos = entradaInt("Insira a quantidade de votos nulos: ");

        entradaFechar();

        int total_votos = (votos_c1 + votos_c2 + votos_c3 + qnt_brancos + qnt_nulos);
        double porct_brancos = (qnt_brancos*100)/total_votos;
        double porct_nulos = (qnt_nulos*100)/total_votos;
        
        saidaString("O total de votos é: " + total_votos);
        saidaString("A porcentagem de votos brancos é: " + porct_brancos);
        saidaString("A porcentagem de votos nulos é: " + porct_nulos);
    }
}
