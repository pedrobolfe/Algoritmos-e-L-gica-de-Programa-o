import java.util.Scanner;

public class Prodecimentos {
    static Scanner leitor;

    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }

    public static void entradaFechar(){
        leitor.close();
    }

    public static int addCinco(int a){
        return a + 5;
    }

    public static int somaDoisNum(int a, int b){
        return a + b;
    }

    public static int difDoisNum(int a, int b){
        return Math.abs(a-b);
    }

    // exercicio 4 em diante
}
