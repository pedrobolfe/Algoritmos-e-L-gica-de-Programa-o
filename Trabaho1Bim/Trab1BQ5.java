    import java.util.Scanner;

    public class Trab1BQ5 {

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
        System.out.println(mensagem);
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
        System.out.print(mensagem);
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
        float a, b, c;
        double delta, x1, x2;

        // Entrada de dados
        entradaAbrir();
        a = lerFloat("Digite o valor A: ");
        b = lerFloat("Digite o valor B: ");
        c = lerFloat("Digite o valor C: ");
        entradaFechar();

        // Processamento
        delta = ((Math.pow(b, 2) - 4*a*c)); // calculando delta

        if (delta < 0){ // se delta for menor que zero, e pq nao existe raiz real
            System.out.println("Sem raízes no conjunto dos números reais.");
        }else {
            delta = Math.sqrt(delta); // calculando a raiz de delta
            x1 = (-b + delta) / 2*a; // calculando x1 e x2
            x2 = (-b - delta) / 2*a;

            System.out.printf("x1 = " + x1 + ", x2 = " + x2); // exibindo x1 e x2
        }
    }
}