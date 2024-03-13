import java.util.Scanner;

public class Prodecimentos {
    static Scanner leitor;

    public static void entradaAbrir(){
        leitor = new Scanner(System.in);
    }

    public static void entradaFechar(){
        leitor.close();
    }
    
    public static String entradaString(String mensagem){
        System.out.print(mensagem);
        return leitor.nextLine();
    }
    
    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return leitor.nextInt();
    }
    
    public static double entradaDouble(String mensagem){
        System.out.print(mensagem);
        return leitor.nextDouble();
    }
    
    public static float entradaFloat(String mensagem){
        System.out.print(mensagem);
        return leitor.nextFloat();
    }
    
    
// 1 Elaborar um programa que leia um valor inteiro e passe para uma função que irá adicionar 5 ao valor, retorne ao programa e escreva o resultado da soma.
    public static int addCinco(int a){
        return a + 5;
    }

// 2 Elaborar um programa que leia 2 valores inteiros e uma função para realizar a soma destes. Desenvolva também um procedimento responsável pela apresentação do resultado.
    public static int somaDoisNum(int a, int b){
        return a + b;
    }
    
// 3 Elaborar um programa que leia 2 valores inteiros e uma função que mostre a diferença entre eles.
    public static int difDoisNum(int a, int b){
        return Math.abs(a-b);
    }
    
// 4 Elaborar uma função que leia um número inteiro e passe para um procedimento que é responsável por imprimi-lo.
    public static void lerInt_imprimir(){
        int x = leitor.nextInt();
        imprimitInt(x);
    }
    
    public static void imprimitInt(int num){
        System.out.print(num);
    }

// 5 Elaborar um programa que leia a altura dos andares de um prédio e o número de andares, e uma função para calcular a altura do prédio.
    
    public static void calculaAlturaPredio(){
        int x = entradaInt("Altura do andar: ");
        int y = entradaInt("Número de andares: ");
        int altura_predio = y*x;
        imprimitInt(altura_predio);
    }

// 6 Elaborar um programa que leia o comprimento, a altura e a espessura de um sólido cúbico. Com isso desenvolva uma função para calcular o volume do sólido e um procedimento para apresentar o volume do sólido.
    public static void calcula_volume_Cubo(int comp, int altura, int espessura){
        mostrar_volume(comp * altura * espessura);
    }
    
    public static void mostrar_volume(float volume){
        System.out.println("Volume: " + volume + " cm3");
    }
// 7 Elaborar um programa que solicita ao usuário para digitar três números, em seguida uma função para calcular a soma deles um procedimento para imprimir.
    public static void soma_tres_num(int a, int b, int c){
        int soma = a +b +c;
        imprimir_soma(soma);
    }
    public static void imprimir_soma(int soma){
        System.out.println("Soma: " + soma);
    }
    
// 8 Elaborar um programa que leia um número real. Além disso, desenvolva uma função para calcular o resultado do quadrado desse número, e um procedimento para imprimir o resultado.
    public static void real_quadrado(double num){
        imprimir_real(Math.pow(num, 2));
    }
    public static void imprimir_real(double result){
        System.out.println(result);
    }
// 9 Elaborar um programa que leia um número real. Além disso, desenvolva uma função para calcular um procedimento para imprimir a quinta parte deste número.
    public static void real_quinta_parte(double num){
        imprimir_parte(num/5);
    }
    public static void imprimir_parte(double result){
        System.out.println(result);
    }
    
// 10 Elaborar funções para receber um valor em real e a cotação em dólares. Em seguida, imprima o valor final, após o câmbio do dinheiro, em um procedimento separado..
    public static void convert_real_dolar(float real, float dolar){
        imprimir_conversao(real/dolar);
    }
    
    public static void imprimir_conversao(float result){
        System.out.println("Total em dólar $" + result);
    }

// 11 Elaborar um procedimento que leia um número inteiro e imprima o seu antecessor e o seu sucessor.
    public static void imprimir_antecessor_sucessor(int num){
        System.out.printf("Seu antecessor é " + (num-1) + ", o sucessor é "+ (num+1));    
    }
// 12 Elaborar um procedimento para ler um número inteiro e imprima a soma do dobro do sucessor com o dobro do seu antecessor.    
    public static void imprimir_dobro_antecessor_dobro(int num){
        int soma = ((num-1)*2) + ((num+1)*2);
        System.out.println("A soma do dobro do antecessor e sucessor é " + soma);
    }
// 15 Considerando as seguintes informações de um automóvel: marca, quilometragem inicial, quilometragem final, 
// litros consumidos e capacidade do tanque de combustível. Elaborar um programa e funções que emita um relatório na tela 
// contendo os dados informado e qual o consumo do automóvel em km/litros e qual a sua autonomia (km/tanque).
    public static void eficiencia_carro(String marca, int km_inicial, int km_final, int gasolina_consumida, int capacidade_gasolina){
        int km = km_final - km_inicial;
        float consumo = (float) km/gasolina_consumida ;
        float autonomia = (float) km/capacidade_gasolina;
        
        System.out.println("Marca = " + marca + 
                           "\nConsumo do automóvel em (km/litros) = " + consumo + 
                           "\nAutonomia (km/tanque) = " + autonomia);
    }
// 16 Elaborar uma função para calcula o valor a ser pago pelos passageiros pelo excesso de bagagem. 
// Considerando que até 25kg o valor é R$2.50 e o excedente custa R$0.75 por quilo. Por fim, exiba o peso total, 
// o peso excedente e o valor a ser pago pelo passageiro.
    public static void calculo_bagagem(int peso_total){
        int peso_excedente = Math.max(peso_total - 25, 0); // caso o peso seja menor que 25
        float valor_excedente = (float) peso_excedente * (75.0f/100.0f); 
        float valor_total = 2.5f + valor_excedente ;
        
        System.out.println("Peso total: " + peso_total + 
                           "\nPeso excedente: " + peso_excedente + 
                           "\nValor total = R$" + valor_total);
    }
    
// 18 Desenvolva funções que, mediante a leitura de uma distância (em Km), do período de tempo (em hora)
// utilizado para percorrê-lo e da quantidade de combustível (em litros) utilizada, calcule a velocidade 
// média(em Km/h) e o consumo médio do automóvel (em Km/l).
    public static void calculo_viajem(float distancia_km, float periodo_horas, float combustivel){
        System.out.println("velocidade média(em Km/h) = " + (distancia_km/periodo_horas) + 
                           "\nconsumo médio do automovel (em Km/l) = " + (distancia_km/combustivel));
    }
    
// 19 Uma pessoa comprou quatro artigos em uma loja. Para cada artigo, tem-se nome, preço e percentual de desconto. 
// Elaborar um programa e funções para imprimir nome, preço e preço com desconto de cada artigo. Imprimir também o total a pagar.
    public static String[] artigo(){
        String[] dados_artigo = new String[3];
        dados_artigo[0] = entradaString("Nome do artigo: ");
        dados_artigo[1] = entradaString("Preço: ");
        dados_artigo[2] = entradaString("Percentual desconto: ");
        return dados_artigo;
    }
    public static void imprimeArtigo(String nome, float preco, float preco_desconto){
        System.out.println("Artigo: " + nome + ", Valor: R$" + preco + ", Valor com desconto: R$" + preco_desconto);
    }
    
    public static void artigos_loja(String[] artigo1, String[] artigo2, String[] artigo3, String[] artigo4){
        float total;
        // artigo 01
        float preco1 = Float.parseFloat(artigo1[1]);
        float desconto1 = Float.parseFloat(artigo1[2]);
        float valor_desconto1 = (float) (preco1 - (preco1*(desconto1/100.0f)));
        // artigo 02
        float preco2 = Float.parseFloat(artigo2[1]);
        float desconto2 = Float.parseFloat(artigo2[2]);
        float valor_desconto2 = (float) (preco2 - (preco2*(desconto2/100.0f)));
        // artigo 03
        float preco3 = Float.parseFloat(artigo1[1]);
        float desconto3 = Float.parseFloat(artigo1[2]);
        float valor_desconto3 = (float) (preco3 - (preco3*(desconto3/100.0f)));
        // artigo 04
        float preco4 = Float.parseFloat(artigo1[1]);
        float desconto4 = Float.parseFloat(artigo1[2]);
        float valor_desconto4 = (float) (preco4 - (preco4*(desconto4/100.0f)));
        
        // imprimir dados artigos
        imprimeArtigo(artigo1[0], preco1, valor_desconto1);
        imprimeArtigo(artigo2[0], preco2, valor_desconto2);
        imprimeArtigo(artigo3[0], preco3, valor_desconto3);
        imprimeArtigo(artigo4[0], preco4, valor_desconto4);
        System.out.println("Total a pagar = R$" + (valor_desconto1+valor_desconto2+valor_desconto3+valor_desconto4));
    }    
    
    
    public static void main(String[] args){
        System.out.println("Olá Mundo");
        entradaAbrir();
        //calcula_volume_Cubo(entradaInt("Comprimento cubo: "), entradaInt("Altura cubo: "), entradaInt("Espessura cubo: "));
        //soma_tres_num(entradaInt("Num A: "), entradaInt("Num B: "), entradaInt("Num C: "));
        //real_quadrado(entradaDouble("Digite um número real: "));
        //real_quinta_parte(entradaDouble("Digite um numero: "));
        //convert_real_dolar(entradaFloat("Total em real: "), entradaFloat("Valor do dolár: "));
        //imprimir_antecessor_sucessor(entradaInt("Digite um número: "));
        //imprimir_dobro_antecessor_dobro(entradaInt("Digite um número: "));
        //eficiencia_carro(entradaString("Digite a marca do carro: "), 1752, 1956, 60, 100);
        //calculo_bagagem(20);
        //calculo_viajem(152.0f, 2.2f, 15.0f);
        artigos_loja(artigo(), artigo(), artigo(), artigo());
        entradaFechar();
    }
}
