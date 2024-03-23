import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        if (a > b && a > c){
            System.out.println("Maior número: " + a);
        }
        if (b > a && b > c){
            System.out.println("Maior número: " + b);
        }
        if (c > a && c > b){
            System.out.println("Maior número: " + c);
        }

        if (a<b && a<c){
            System.out.println("Menor número: " + a);
        }
        if (b<a && b<c){
            System.out.println("Menor número: " + b);
        }
        if (c<b && c<a){
            System.out.println("Menor número: " + c);
        }
    }
}
