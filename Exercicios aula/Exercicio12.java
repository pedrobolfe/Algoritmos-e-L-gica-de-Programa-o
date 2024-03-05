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
        System.out.println(mensagem);
    }

    public static void main(String[] args){
        int votos_c1, votos_c2, votos_c3, qnt_brancos, qnt_nulos, total_votos;
        float porct_c1, porct_c2, porct_c3, porct_brancos, porct_nulos;

        entradaAbrir();
        
        votos_c1 = entradaInt("Insira a quantidade de votos do candidato C1: ");
        votos_c2 = entradaInt("Insira a quantidade de votos do candidato C2: ");
        votos_c3 = entradaInt("Insira a quantidade de votos do candidato C3: ");
        qnt_brancos = entradaInt("insira a quantidade de votos brancos: ");
        qnt_nulos = entradaInt("Insira a quantidade de votos nulos: ");

        entradaFechar();

        total_votos = (votos_c1 + votos_c2 + votos_c3 + qnt_brancos + qnt_nulos);

        porct_c1 = ((float) votos_c1 * 100) / total_votos;
        porct_c2 = ((float) votos_c2 * 100) / total_votos;
        porct_c3 = ((float) votos_c3 * 100) / total_votos;

        porct_brancos = ((float)qnt_brancos*100)/total_votos;
        porct_nulos = ((float)qnt_nulos*100)/total_votos;

        saidaString("\nO total de votos é: " + total_votos);
        saidaString("A porcentagem de votos do candidato 1 é: " + porct_c1 + "%");
        saidaString("A porcentagem de votos do candidato 2 é: " + porct_c2 + "%");
        saidaString("A porcentagem de votos do candidato 3 é: " + porct_c3 + "%");
        saidaString("A porcentagem de votos brancos é: " + porct_brancos + "%");
        saidaString("A porcentagem de votos nulos é: " + porct_nulos + "%");
    }
}
