import java.util.Scanner;

public class Maca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de maças: ");
        int qnt_maca = leitor.nextInt();

        if (qnt_maca >= 12){
            System.out.println("R$" + (float) qnt_maca * 0.25f);
        } else {
            System.out.println("R$" + (float) qnt_maca * 0.30f);
        }
    }
}