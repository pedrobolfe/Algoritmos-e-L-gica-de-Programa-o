import java.util.Scanner;

public class Aula1 {
    static Scanner entrada;

    // Módulo para abrir a entrada
    public static void entradaAbrir() {
        entrada = new Scanner(System.in);
    }

    // Módulo para fechar a entrada
    public static void entradaFechar() {
        entrada.close();
    }

    public static int lerInt(String mensagem) {
        // mostra a mensagem
        System.out.print(mensagem);
        // lê o valor e o retorna para que seja atribuído à variável
        return entrada.nextInt();
    }

    public static void tabuada(int num) {
        int i = 1;

        while (num<=10){
            System.out.println("5 x " + num + " = " + i*num);
            num++;
        }
    }

    public static int maioNum(){
        int num, i, aux;

        i = 1;
        entradaAbrir();
        aux = lerInt("Digite um valor: ");
        while (i<=5){
            num = lerInt("Digite um valor: ");

            if (num < aux){
                aux = num;
            }
            i++;
        }
        entradaFechar();

        return aux;
    }

    public static int somaNums(){
        int num, i, aux;

        i = 1;
        entradaAbrir();
        aux = 0;
        while (i<=5){
            num = lerInt("Digite um valor: ");
            aux +=num;
            i++;
        }
        entradaFechar();

        return aux;
    }

    public static void somaParImpar(){
        int num, impar, par;
    
        entradaAbrir();
        impar = 0;
        par = 0;

        while (true){
            num = lerInt("Digite um valor: ");
            if (num < 0){
                break;
            } else if (num %2==0){
                par++;
            } else {
                impar++;
            }
        }
        entradaFechar();
        System.out.println("Impares: " + impar + "; Pares: " + par);
    }

    public static void somaIntervalo(){
        int num_ini, num_fim, aux;

        entradaAbrir();

        num_ini = lerInt("Digite o numero inicial: ");
        num_fim = lerInt("Digite o numero final: ");
        aux = 0;

        while (num_ini <= num_fim) {
            aux+=num_ini;
            num_ini++;
        }
        entradaFechar();
        System.out.println("A soma desse intervalo de numeros e " + aux);
    }

    public static void divisoresComuns (){
        int num, i;

        entradaAbrir();
        num = lerInt("Digite um numero: ");
        entradaFechar();
        i=1;

        while (i<=(num/2)) {
            if (num%i==0){
                System.out.println("Este numero e divisivel por " + i);
            }
            i++;
        }
    }

    public static int fatorial(int num){
        // int aux=1;

        // while (num > 0) {
        //     aux *= num;
        //     num--;
        // }
        // System.out.println("O Fatorial de n e " + aux);
        if (num == 0){
            return 1;
        }
        return num * fatorial(num-1);
    }

    public static int fibonacci(int n){
        if (n <=2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void sequencia(int n){
        int i= 1;
        String aux = "";
        while (i <= n+1) {
            aux += i + " ";
            System.out.println(aux);
            i++;
        }
    }

    public static void main(String[] args) {
        // entradaAbrir();
        // int num = lerInt("Digite um valor: ");
        // entradaFechar();

        entradaAbrir();
        sequencia(lerInt("Digite um num: "));
        // System.out.println(num);
        entradaFechar();
        
    }
}