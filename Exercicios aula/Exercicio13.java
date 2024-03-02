import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de fabrica do carro: ");
        float valor_fabrica = leitor.nextFloat();

        leitor.close();
        
        float val_dist = valor_fabrica * (28/100f);
        float val_impostos = valor_fabrica * (45/100f);

        System.out.println("Valor do carro para o consumidor final = R$" + (float)(valor_fabrica + val_dist + val_impostos));
    }    
}