import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();

        float quadrado = (float) Math.sqrt(num);
        float cubo = (float) Math.cbrt(num);

        System.out.println(quadrado);
        System.out.println(cubo);
        leitor.close();
    }
}