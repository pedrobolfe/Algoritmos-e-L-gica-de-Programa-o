import java.util.Scanner;

public class Main {
    static Scanner entrada;

    public static void entradaAbrir(){
        entrada = new Scanner(System.in);
    }

    public static void entradaFechar(){
        entrada.close();
    }

    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static int fatorial(int num) {
        int aux = 1;

        for (int i = num; i > 1; i--){
            aux*=i;
        }
        return aux;
    }
    
    public static void sequenciaNum1(int num) {
        String aux="";
        for (int i = 1; i <= num; i++) {
            aux += i + " ";
            System.out.println(aux);
        }
    }

    public static void numPerfeito(){ // numeros perfeitos num intervalo de 1 a 10000
        int aux;
        for (int i = 1; i <= 1000000; i++){
            aux = 0;
            for (int j = 1; j < i; j++) {
                if (i%j == 0){
                    aux+=j;
                }
            }
            if (aux == i){
                System.out.printf("O numero %d e perfeito\n", i);
            }

        }
    }
    // Desenvolva um algoritmo que pergunta um numero k ao usuário. E em seguida, mostre os k primeiros numeros primos
    public static void numPrimo(){
        entradaAbrir();
        int num = lerInt("DIgite um numero: ");
        entradaFechar();

        for (int i = 2; i <= num; i++){ // for q vai ate o numero digitado
            boolean primo = true;
            for (int j = 2 ; j < i; j++) { // for para pegar a divisao e saber se eh primo
                if (i%j == 0){
                    primo = false;
                    break;
                }
            }
            if (primo){
                System.out.printf("%d e primo\n", i);
            }
        } 
    }


    public static void main(String[] args){
        numPrimo();
    }
}
