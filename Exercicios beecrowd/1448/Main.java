import java.util.Scanner;

public class Main {
    static Scanner leitor;

    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }
    public static void entradaFechar(){
        leitor.close();
    }

    public static String lerString(){
        return leitor.nextLine();
    } 
    public static int lerInt(){
        return leitor.nextInt();
    }

    public static void main(String[] args) {
        int cont_eqp1, cont_eqp2, num;
        String frase_correta, frase_eqp1, frase_eqp2, saida;

        entradaAbrir();
        num = lerInt();

        for (int i = 0; i < num; i++){
            cont_eqp1 = 0;
            cont_eqp2 = 0;
            
            frase_correta = lerString();
            frase_eqp1 = lerString();
            frase_eqp2 = lerString();

            for (int j = 0; j < frase_correta.length(); j++){
                if (frase_eqp1.charAt(j) == frase_correta.charAt(j)){
                    cont_eqp1++;
                } 
                if (frase_eqp2.charAt(j) == frase_correta.charAt(j)){
                    cont_eqp2++;
                }
            }

            saida = ( cont_eqp1 == cont_eqp2) ? ("Instancia " + i + "\nempate\n") : ("");
            saida = ( cont_eqp1 > cont_eqp2) ? ("Instancia " + i + "\ntime 1\n") : ("Instancia " + i + "\ntime 2\n");
            System.out.println(saida);
        }
        entradaFechar();
        
    }
}
