import java.util.Scanner;

public class Main {

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

    public static void main(String[] args) {
        // Variáveis
        int lin, col;

        // Entrada de dados
        entradaAbrir();
        lin = lerInt();
        col = lerInt();
        entradaFechar();

        // Processamento
        if (lin >= 1 && col >= 1) { // verificando se a linha e coluna sao maiores que 1
            if ((lin%2 == 0 && col%2 == 0) || (lin%2 == 1 && col%2 == 1)) { // varificando se a casa e branca
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}