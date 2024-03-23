import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args){
        //variáveis
        int num;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = entrada.nextInt();
        entrada.close();

        if(num%2 == 0){
            System.out.println("Número digitado é par");
        } else {
            System.out.println("Número digitado é impar");
        }
    }
}
