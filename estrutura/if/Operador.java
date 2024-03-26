import java.util.Scanner;

public class Operador {
    static Scanner leitor;

    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }

    public static void entradaFechar(){
        leitor.close();
    }

    public static float entradaFloat(String mensagem){
        System.out.print(mensagem);
        return leitor.nextFloat();
    }

    public static String entradaString(String mensagem){
            System.out.print(mensagem);
            return leitor.next();
    }

    public static void main(String[] args) {
        entradaAbrir();

        float val1 = entradaFloat("Digite o valor 1: ");
        float val2 = entradaFloat("Digite o valor 2: ");
        String operador = entradaString("Digite o operador: ");

        if (operador.equals("/")){
            System.out.println(val1 + " / " + val2 + " = " + (val1 / val2));
        } else if (operador.equals(" * ")){
            System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
        } else if (operador.equals("+")){
            System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
        } else if (operador.equals("-")){
            System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
        }
        entradaFechar();
    }
}
