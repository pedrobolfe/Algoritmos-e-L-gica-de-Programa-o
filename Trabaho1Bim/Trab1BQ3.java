import java.util.Scanner;

public class Trab1BQ3 {
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

    public static void main(String[] args) {
        // entrada de dados
        entradaAbrir();
        int num = entradaInt("Digite um numero de 0 - 999: ");
        entradaFechar();
        String num_extenso = "";


        // processamento
        int unidade = num % 10; 
        int dezena = (num / 10) % 10;
        int centena = num / 100;

        switch (centena) {
            case 0:
                num_extenso += "";
                break;
            case 1:
                num_extenso += "cencentésimoto ";
                break;
            case 2:
                num_extenso += "ducentésimo ";
                break;
            case 3:
                num_extenso += "tricentésimo  ";
                break;
            case 4:
                num_extenso += "quadringentésimo ";
                break;
            case 5:
                num_extenso += "quingentésimo " ;
                break;
            case 6:
                num_extenso += "sexcentésimo ";
                break;
            case 7:
                num_extenso += "septingentésimo ";
                break;
            case 8:
                num_extenso += "octingentésimo ";
                break;
            case 9:
                num_extenso += "noningentésimo ";
                break;
            default:
                break;
        }

        switch (dezena) {
            case 0:
                num_extenso += "";
                break;
            case 1:
                num_extenso += "décimo ";
                break;
            case 2:
                num_extenso += "vigésimo ";
                break;
            case 3:
                num_extenso += "trigésimo ";
                break;
            case 4:
                num_extenso += "quadragésimo ";
                break;
            case 5:
                num_extenso += "quinquagésimo ";
                break;
            case 6:
                num_extenso += "sexagésimo ";
                break;
            case 7:
                num_extenso += "septuagésimo ";
                break;
            case 8:
                num_extenso += "octogésimo ";
                break;
            case 9:
                num_extenso += "nonagésimo ";
                break;
            default:
                break;
        }

        switch (unidade) {
            case 0:
                num_extenso += "";
                break;
            case 1:
                num_extenso += "primeiro";
                break;
            case 2:
                num_extenso += "segundo";
                break;
            case 3:
                num_extenso += "terceiro";
                break;
            case 4:
                num_extenso += "quarto";
                break;
            case 5:
                num_extenso += "quinto";
                break;
            case 6:
                num_extenso += "sexto";
                break;
            case 7:
                num_extenso += "setimo";
                break;
            case 8:
                num_extenso += "oitavo";
                break;
            case 9:
                num_extenso += "nono";
                break;
            default:
                break;
        }

        // saida de dados
        System.out.println(num_extenso);
    }
}
