import java.util.Scanner;

public class Peso {
    static Scanner leitor;

    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }

    public static void entradaFechar(){
        leitor.close();
    }

    public static float entradaFloat(String mensagem){
        System.out.print(mensagem);
        return leitor.nextFloat();
    }

    public static String entradaString(String mensagem){
            System.out.print(mensagem);
            return leitor.nextLine();
    }
    public static void main(String[] args) {
        entradaAbrir();
        
        String tipo = entradaString("Qual seu sexo? ");
        float altura = entradaFloat("Qual sua altura? ");

        if (tipo.equals("Masculino")){
            System.out.println("Peso Ideal = " + (float) ((72.7 * altura)-58));
        } else if (tipo.equals("Feminino")){
            System.out.println("Peso Ideal = " + (float) ((62.1 * altura)-44));
        }
        entradaFechar();
    }
}
