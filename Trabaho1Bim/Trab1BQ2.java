    import java.util.Scanner;

    public class Trab1BQ2 {

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

    // metodo para calcular o valor a pagar
    // qnt_litros, informa o tanto para o abastecimento
    // preco e desconto varia de acordo com o tipo
    public static float valor_pagar(float qnt_litros, float preco,float desc_litros){
        return qnt_litros * preco - (qnt_litros * preco * desc_litros);
    }

    public static void main(String[] args) {
        // Variáveis
        String tipo;
        float qnt_litros, custo_total;

        // Entrada de dados
        entradaAbrir();
        tipo = lerString("Qual o tipo, E-etanol, G-gasolina:");
        qnt_litros = lerFloat("Digite a quantidade de litros abastecidos: ");
        entradaFechar();
        
        // Processamento
        if (qnt_litros <= 20){
            if (tipo.equals("E")){
                System.out.println("valor a pagar de etanol = " + valor_pagar(qnt_litros, 3.39f, 0.03f));
            } else if (tipo.equals("G")){
                System.out.println("valor a pagar de gasolina = " + valor_pagar(qnt_litros, 5.60f,0.04f));
            }
        } else {
            if (tipo.equals("E")){
                System.out.println("valor a pagar de etanol = " + valor_pagar(qnt_litros, 3.39f, 0.05f));
            } else if (tipo.equals("G")){
                System.out.println("valor a pagar de gasolina= " + valor_pagar(qnt_litros,5.60f,  0.06f));
            }
        } 
    }
}