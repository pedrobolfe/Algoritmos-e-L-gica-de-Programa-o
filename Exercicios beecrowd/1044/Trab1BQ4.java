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

    public static void main(String[] args) {
        int a, b;

        entradaAbrir();
        a = lerInt();
        b = lerInt();
        entradaFechar();

        System.out.println((a%b == 0 || b%a == 0) ? "Sao multiplos" : "Nao sao multiplos");
    }
}