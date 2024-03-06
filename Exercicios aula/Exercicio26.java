import java.util.Scanner;

public class Exercicio26 {
    static Scanner leitor;
    
    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }

    public static void entradaFechar(){
        leitor.close();
    }

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return leitor.nextInt();
    }

    public static void saidaString(String mensagem){
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        int hora_inicial, minutos_inicial, hora_final, minutos_final;
        int minutos_iniciais_totais, minutos_finais_totais, minutos_totais_jogo;
        int hora_jogo, minutos_jogo;

        entradaAbrir();

        hora_inicial = entradaInt("Digite a hora inicial: ");
        minutos_inicial = entradaInt("Digite o minuto inicial: ");

        hora_final = entradaInt("Digite a hora final: ");
        minutos_final = entradaInt("Digite o minuto final: ");
        
        entradaFechar();
        
        minutos_iniciais_totais = hora_inicial*60 + minutos_inicial;
        minutos_finais_totais = hora_final*60 + minutos_final;

        minutos_totais_jogo = minutos_finais_totais - minutos_iniciais_totais; // tempo de jogo em minutos

        // converter minutos de jogo para horas e minutos
        hora_jogo =(int) minutos_totais_jogo / 60;
        minutos_jogo = (int) minutos_totais_jogo % 60;
        
        saidaString(hora_jogo + "h " + minutos_jogo + "min");

        
    }
}
