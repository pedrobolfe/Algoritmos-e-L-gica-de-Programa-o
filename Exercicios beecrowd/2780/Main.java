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
        int a;

        entradaAbrir();
        a = lerInt();
        entradaFechar();

        if ((a >= 0) & (a <= 800)){
            System.out.println(1);
        } else if ((a >= 801) & (a <= 1400)){
            System.out.println(2);
        } else {
            System.out.println(3);
        }

       
    }
}