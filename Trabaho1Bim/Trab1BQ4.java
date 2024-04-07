    import java.util.Scanner;

    public class Trab1BQ4 {

    static Scanner entrada;

    // Módulo para abrir a entrada
    public static void entradaAbrir() {
        entrada = new Scanner(System.in);
    }

    // Módulo para fechar a entrada
    public static void entradaFechar() {
        entrada.close();
    }

    // Módulo para ler um valor inteiro
    public static int lerInt() {
        return entrada.nextInt();
    }

    // Módulo para ler um valor inteiro e mostrar uma mensagem
    public static int lerInt(String mensagem) {
        // mostra a mensagem
        System.out.print(mensagem);
        // lê o valor e o retorna para que seja atribuído à variável
        return entrada.nextInt();
    }

    // Módulo para ler um valor float
    public static float lerFloat() {
        return entrada.nextFloat();
    }

    // Módulo para ler um valor inteiro e mostrar uma mensagem
    public static float lerFloat(String mensagem) {
        // mostra a mensagem
        System.out.println(mensagem);
        // lê o valor e o retorna para que seja atribuído à variável
        return entrada.nextFloat();
    }

    // Módulo para ler um valor String
    public static String lerString() {
        return entrada.next();
    }

    // Módulo para ler um valor inteiro e mostrar uma mensagem
    public static String lerString(String mensagem) {
        // mostra a mensagem
        System.out.println(mensagem);
        // lê o valor e o retorna para que seja atribuído à variável
        return entrada.next();
    }

    public static void main(String[] args) {
        // Variáveis
        int lin, col;

        // Entrada de dados
        entradaAbrir();
        lin = lerInt("Digite a linha: ");
        col = lerInt("Digite a Coluna: ");
        entradaFechar();

        // Processamento
        if (lin >= 1 && col >= 1) { // verificando se a linha e coluna sao maiores que 1
            if ((lin%2 == 0 && col%2 == 0) || (lin%2 == 1 && col%2 == 1)) { // varificando se a casa e branca
                System.out.println("Branca");
            } else {
                System.out.println("Preta");
            }
        }
        
    }
}