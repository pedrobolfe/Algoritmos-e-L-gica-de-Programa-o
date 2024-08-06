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

    public static int mmc(int num_a, int num_b){
        int maior = num_a < num_b ? num_a : num_b; // descobrir o maior valor entre os numeros 

        for (int i = maior; i <= num_a*num_b; i++) {
            if (i%num_a == 0 && i%num_b == 0) {
                return i;
            }
        }
        return 0;
    }

    public static int mmcLista(int[] in_nums) {
        int maior = in_nums[0];
        int mult_nums = 1;
    
        for (int p = 0; p < in_nums.length; p++) {
            maior = in_nums[p] > maior ? in_nums[p] : maior; // descobrir o maior numero do array
            mult_nums *= in_nums[p]; // descobrir a multiplicacao dos numeros
        }
    
        for (int i = maior; i <= mult_nums; i++) { // percorrendo do maior numero ate a multiplicacao de todos
            boolean eh_mmc = true; // variavel para ter controle se e mmc
            for (int j = 0; j < in_nums.length; j++) { // percorrendo cada numero do array
                if (i % in_nums[j] != 0) { // se algum numero ter resto 0, o i nao vai ser o mmc, entao ja da break
                    eh_mmc = false;
                    break;
                }
            }
            if (eh_mmc) { return i; }
        }
    
        return 0;
    }


    public static int mdc(int num_a, int num_b){
        int aux=0;
        for (int i = 1; i <= num_a; i++) {
            if (num_a%i == 0 && num_b%i == 0) {
                aux = i;
            }
        }
        return aux;
    }

    public static void seqDecrescente(int num){ // sem usar for ou while
        if (num >= 0){
            System.out.println(num);
            seqDecrescente(num-1);
        }
    }

    public static int fibo(int n){
        if (n == 1 || n == 2){
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2);
        }

    }

    public static void main(String[] args){
        // int[] numeros = {4, 8, 12, 16};
        // int result = mmcLista(numeros);
        // System.out.println("Minimo multiplicador comum e " + result);

        // result = mdc(12, 30);
        // System.out.println("Maximo divisor comum e " + result);
        seqDecrescente(6);
    }
}
