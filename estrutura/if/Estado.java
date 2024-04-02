import java.util.Scanner;


public class Estado {
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

    public static void main(String[] args){
        entradaAbrir();

        int codigo = entradaInt("DIgite o codigo do Estado: ");

        // if (codigo == 41){
        //     System.out.println("Estado: Parana, Sigla: PR, Regiao: Sul");
        // } else if (codigo == 42){
        //     System.out.println("Estado: Santa Catarina, Sigla: SC, Regiao: Sul");
        // } else if (codigo == 43){
        //     System.out.println("Estado: Rio Grande do SUl, Sigla: RS, Regiao: Sul");
        // } else {
        //     System.out.println("Estado ainda nao cadastrado");
        // }

        switch (codigo) {
            case 11:
                System.out.println("Estado: Rondônia, Sigla: RO, Regiao: Norte");
                break;
            case 12:
                System.out.println("Estado: Acre, Sigla: AC, Regiao: Norte");
                break;
            case 13:
                System.out.println("Estado: Amazonas, Sigla: AM, Regiao: Norte");
                break;
            case 14:
                System.out.println("Estado: Roraima, Sigla: RR, Regiao: Norte");
                break;
            case 15:
                System.out.println("Estado: Pará, Sigla: PA, Regiao: Norte");
                break;
            case 16:
                System.out.println("Estado: Amapá, Sigla: AP, Regiao: Norte");
                break;
            case 17:
                System.out.println("Estado: Tocantins, Sigla: TO, Regiao: Norte");
                break;
            case 21:
                System.out.println("Estado: Maranhão, Sigla: MA, Regiao: Nordeste");
                break;
            case 22:
                System.out.println("Estado: Piauí, Sigla: PI, Regiao: Nordeste");
                break;
            case 23:
                System.out.println("Estado: Ceará, Sigla: CE, Regiao: Nordeste");
                break;
            case 24:
                System.out.println("Estado: Rio Grande do Norte, Sigla: RN, Regiao: Nordeste");
                break;
            case 25:
                System.out.println("Estado: Paraíba, Sigla: PB, Regiao: Nordeste");
                break;
            case 26:
                System.out.println("Estado: Pernambuco, Sigla: PE, Regiao: Nordeste");
                break;
            case 27:
                System.out.println("Estado: Alagoas, Sigla: AL, Regiao: Nordeste");
                break;
            case 28:
                System.out.println("Estado: Sergipe, Sigla: SE, Regiao: Nordeste");
                break;
            case 29:
                System.out.println("Estado: Bahia, Sigla: BA, Regiao: Nordeste");
                break;
            case 31:
                System.out.println("Estado: Minas Gerais, Sigla: MG, Regiao: Sudeste");
                break;
            case 32:
                System.out.println("Estado: Espírito Santo, Sigla: ES, Regiao: Sudeste");
                break;
            case 33:
                System.out.println("Estado: Rio de Janeiro, Sigla: RJ, Regiao: Sudeste");
                break;
            case 35:
                System.out.println("Estado: São Paulo, Sigla: SP, Regiao: Sudeste");
                break;
            case 41:
                System.out.println("Estado: Paraná, Sigla: PR, Regiao: Sul");
                break;
            case 42:
                System.out.println("Estado: Santa Catarina, Sigla: SC, Regiao: Sul");
                break;
            case 43:
                System.out.println("Estado: Rio Grande do Sul, Sigla: RS, Regiao: Sul");
                break;
            case 50:
                System.out.println("Estado: Mato Grosso do Sul, Sigla: MS, Regiao: Centro-Oeste");
                break;
            case 51:
                System.out.println("Estado: Mato Grosso, Sigla: MT, Regiao: Centro-Oeste");
                break;
            case 52:
                System.out.println("Estado: Goiás, Sigla: GO, Regiao: Centro-Oeste");
                break;
            case 53:
                System.out.println("Estado: Distrito Federal, Sigla: DF, Regiao: Centro-Oeste");
                break;
            default:
                System.out.println("Código de estado desconhecido.");
                break;
        }
    }
}