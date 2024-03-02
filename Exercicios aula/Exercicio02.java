import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();

        System.out.println((int) Math.pow(num, 3));
        leitor.close();
    }
}
