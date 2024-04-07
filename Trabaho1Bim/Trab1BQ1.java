import java.util.Scanner;

public class Trab1BQ1{
    static Scanner entrada;
    static int valor; // valor total, ira subtraindo as notas ate 0

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
    // metodo para calcular as notas
    // parametro: valor_restante que vai ser o valor total descontando as notas calculadas
    // parametro: notas, vai ser informado na chamada de metodo para fazer as contas
    public static int calcula_resto(int valor_restante, int notas){ 
        int qnt_notas = (int) valor_restante / notas; // divisao inteira do valor restante pela nota informada, obtendo a qnt de notas necessarias de cada valor
        valor -= (qnt_notas * notas); // sera descontado do valor total as notas
        return qnt_notas;
    }

    public static void main(String[] args) {
        // Variáveis
        int notas_100, notas_50, notas_20, notas_10, notas_5, notas_2, notas_1;

        // Entrada de dados
        entradaAbrir();
        valor = lerInt("DIgite o valor a sacar: ");
        entradaFechar();

        // Processamento
        if (valor >= 1 && valor <= 5000){ // se o valor e menor que 5000 e maior que 1
            // inicializando as variaveis
            notas_100 = calcula_resto(valor, 100);
            notas_50 = calcula_resto(valor, 50);
            notas_20 = calcula_resto(valor, 20);
            notas_10 = calcula_resto(valor, 10);
            notas_5 = calcula_resto(valor, 5);
            notas_2 = calcula_resto(valor, 2);
            notas_1 = calcula_resto(valor, 1);

            // saida de dados
            System.out.printf("%d notas de R$ 100,00\n", notas_100);
            System.out.printf("%d notas de R$ 50,00\n", notas_50);
            System.out.printf("%d notas de R$ 20,00\n", notas_20);
            System.out.printf("%d notas de R$ 10,00\n", notas_10);
            System.out.printf("%d notas de R$ 5,00\n", notas_5);
            System.out.printf("%d notas de R$ 2,00\n", notas_2);
            System.out.printf("%d notas de R$ 1,00\n", notas_1);
        } else { // se a condicao for falsa, exibe uma mensagem
            // saida de dados
            System.out.println("Valor indisponivel para saque");
        }
    }
}