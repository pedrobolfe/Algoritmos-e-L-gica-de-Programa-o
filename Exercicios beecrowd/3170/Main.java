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
        int b, g;

        entradaAbrir();
        b = lerInt();
        g = lerInt();
        entradaFechar();

        int x = (b <= g)? g/2 - b: 0;
        System.out.println((x <= 0) ? "Amelia tem todas bolinhas!" : "Faltam " + (x) + " bolinha(s)");
    }
}