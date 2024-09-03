package Trabalho2bim;

public class AED2024_2B_T01 {


    public static String hello(){
        //Deve retornar "Hello world!"

        // return "Hello world!";
        return "Hello world!";
    }

    public static boolean primo(int num){
        if (num < 2) return false; // menor que dois nao e primo
        if (num == 2) return true;
        for (int i = 2 ; i < num; i++) { // for para pegar a divisao e saber se eh primo
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int obterSomaPrimosIntervalo(int m, int n){ // FEITO E CORRETO

        int soma = 0, i=2, num=0;

        while (num < n){
            if (primo(i)){
                num++;
                if (num >= m) {
                    soma+=i;
                }
            }
            i++;
        }
        
        return soma;
    }

    public static boolean verificarPotenciaN(int x, int n){ // FEITO E CORRETO
        int aux = n;
        while (x >= aux) {
            if (x <= aux) break;
            aux*=n;
        }
        return x==aux ? true : false;
    }

    public static double obterDistanciaCartesiana(double x0, double y0, double x1, double y1){ //FEITO E CORRETO
        double dist =  Math.pow((double) (x1-x0), 2) + Math.pow((double) (y1-y0), 2);

        return Math.sqrt(dist);
    }

    public static double converterTemperatura(double temperaturaEntrada, char escalaEntrada, char escalaSaida){//FEITO E CORRETO
        if (escalaEntrada == 'C' || escalaEntrada == 'c'){ // FEITO
            if (escalaSaida == 'C' || escalaSaida == 'c') return (double) temperaturaEntrada;
            if (escalaSaida == 'K' || escalaSaida == 'k') return (double) (temperaturaEntrada + 273.15);
            if (escalaSaida == 'F' || escalaSaida == 'f') return (double) ((temperaturaEntrada * 9/5) + 32);
        }else if (escalaEntrada == 'K' || escalaEntrada == 'k'){ // FEITO
            if (escalaSaida == 'K' || escalaSaida == 'k') return (double) temperaturaEntrada;
            if (escalaSaida == 'F' || escalaSaida == 'f') return (double) (((temperaturaEntrada - 273.15) * 9/5) + 32);
            if (escalaSaida == 'C' || escalaSaida == 'c') return (double) (temperaturaEntrada - 273.15);
        }
        else if (escalaEntrada == 'F' || escalaEntrada == 'f'){ // feito
            if (escalaSaida == 'F' || escalaSaida == 'f') return (double) temperaturaEntrada;
            if (escalaSaida == 'K' || escalaSaida == 'k') return (double) (((temperaturaEntrada - 32)* 5/9) + 273.15);
            if (escalaSaida == 'C' || escalaSaida == 'c') return (double) ((temperaturaEntrada - 32) * 5/9);
        } else {
            System.out.println("Erro parametros invalidos");
        }
        return (double) temperaturaEntrada;
    }

    public static String obterFrequencia(String frase){
        String freq = "";
        char c_atual;
        int qnt = 0;
        boolean jaTem = false;

        for (int i = 0; i < frase.length(); i++){
            c_atual = frase.charAt(i);
            for (int p = 0; p < freq.length(); p++){
                if (freq.charAt(p) == frase.charAt(i)){
                    jaTem = true;
                    break;
                }
            }
            if (jaTem == false){
                for (int j = i;j < frase.length(); j++){
                    if (c_atual == frase.charAt(j)){
                        qnt++;
                    }
                }
                freq += c_atual + "" + qnt;
                qnt=0;
            }
            jaTem=false;
        }
        return freq;
    }
    // FEITA E CORRETA
    public static boolean verificarAnagrama(String palavra_a, String palavra_b){
        if (palavra_a.length() != palavra_b.length()) return false;
        String saida = obterFrequencia(palavra_a.toLowerCase());
        String saidb = obterFrequencia(palavra_b.toLowerCase());

        int tam = saida.length(), cont = 0;
        String aux, aux2;

        for (int i = 0; i < tam; i+=2){
            aux = saida.substring(i, i+2);
            for (int j = 0; j < tam; j+=2){
                aux2 = saidb.substring(j, j+2);
                if (aux.equals(aux2)){
                    cont+=2;
                }
            }
        }
        return cont == tam ? true : false;
    }
    
    // Feita e Correta
    public static String contarRepeticoesSeguidas(String entrada){// ..,,aaaAAAAA--------!!!!!!!!!!!!!!!999999900      .
        if (entrada.length() == 0) return "";
        String saida = "";
        int aux = 0;
        char ultimo_c = entrada.charAt(0);
        for (int i = 0; i < entrada.length(); i++){
            if (entrada.charAt(i) == ultimo_c){
                aux ++;
            } else{
                saida += aux + ""+ ultimo_c+",";
                aux=1;
            }
            ultimo_c = entrada.charAt(i);
        }// nao vai pegar a ultima (posicao "-1") letra e nem a contagem, entao concatenar na string
        saida += aux + "" + entrada.charAt(entrada.length()-1);
        return saida; // a2b2,,3a,5A,8-,15!,79,20,6 ,1.
    }

    public static String addNum(String entrada, int ini, int fim){ // metodo para pegar os numeros de uma string que vai de uma posicao ate tal..
        String num="";

        for (int j = ini+1; j < fim; j++){
            num += entrada.charAt(j);
        }
        return num;
    }
    
     static String repCaractere(String num, char caracter){ // metodo para repetir caracter
        String saida = "";

        for (int j = 0; j < caracteresParaInteiro(num); j++){ // for para repetir as letras pela quantidade indicada
            saida += "" + caracter;
        } 
        return saida;
    }
    // FEITO E CORRETO
    public static String repetirCaracteres(String entrada){//2.,2,,3a,5A,8-,15!,79,20,6 ,1.
        if (entrada.length() == 0) return ""; // se a entrada for "" retornar "" kkkk

        String saida= "", num = ""; // armazenar a saida, num vai ser temporario, armazenar os numeros da ultima virgula ate o primeiro caracter antes da virgula
        char carac_repet = ' '; // armazenar o caracter que vai repetir
        int pos_ultima_virgula = -1; // armazenar a posicao da ultima virgula, comeca em -1 pq nao tem virgula no comeco
        entrada+=", "; // adicionar virgula e um espaco para rotornar a saida inteira e nao ter estouro de memoria do for no (i+1)..

        for (int i =0; i <= entrada.length() -1; i++){
            if (entrada.charAt(i) == ','){ // achar a primeira virgula
                if (entrada.charAt(i+1) == ','){ // caso tiver uma virgula apos a virgula na i, ex: "2,','" a segunda virgula e o alvo
                    carac_repet = entrada.charAt(i); // o caracter para ser repetido vai ser um antes da virgula, (i+1)
                    num += addNum(entrada, pos_ultima_virgula, i); // chamar funcao para ober o numero entra a ultima virgula e a posicao do i -> caractere para repetir
                    pos_ultima_virgula = i+1; // atualizar a posicao da ultima virgula 
                }  else { // caso nao tiver uma virgula apos a i
                    carac_repet = entrada.charAt(i-1); // caso nao seja uma virgula o proximo carac, o caracter para repetir vai ser i-1
                    // chamar funcao para ober o numero entra a ultima virgula e a posicao do i-1 -> caractere para repetir
                    num += addNum(entrada, pos_ultima_virgula, i-1); // i -1 porque o caracter na i e uma virgula
                    pos_ultima_virgula = i; // atualizar a ultima virgula quq seria entrada na i
   
                }
                saida += repCaractere(num, carac_repet); // concatenar na string a repeticao dos caracteres
            }

            num="";
        }
        return saida;//..,,aaaAAAAA--------!!!!!!!!!!!!!!!999999900      .
    }

    // feito e correto
    public static int caracteresParaInteiro(String entrada){// "181234" obs: nao da para usar char como parametro, caso usar, concatene com "" a esquerda
    // https://www.alura.com.br/apostila-java-orientacao-objetos/o-pacote-java-lang
    int aux = 0;
    for (int i = 0; i < entrada.length(); i++){
        int n = entrada.charAt(i) - '0'; // converte o caractere para inteiro
        aux += n* Math.pow(10, entrada.length() -i -1); // n * a casa decimal dele, para chagar na casa deciaml pego a posicao do char pelo tamanho da string - a posicao do i - 1
    }
    return aux;// 151234
    }

    public static boolean verificaNum(char num){ 
        if (num == '1' || num == '2' || num == '3' || num == '4' || num == '5' || num == '6' || num == '7' || num == '8' || num == '9' || num == '0') return true;
        return false;
    }

    public static boolean validarCPF(String cpf){// "987.654.321-00"
        // validar formato => ###.###.###-## e validar o tamanho
        if (cpf.length() != 14) return false;
        if (cpf.charAt(3) != '.' || cpf.charAt(7) != '.'  || cpf.charAt(11) != '-'){
            return false;
        }

        int somadv1 = 0, somadv2 = 0, digitodv1 = 0, digitodv2 = 0;
        String cpf_limpo = "";
        for (int t = 0; t < cpf.length(); t++){
            if (verificaNum(cpf.charAt(t)) == true){
                cpf_limpo += cpf.charAt(t);
            }
        }

        if (cpf_limpo.length() != 11) return false; // se nao tiver o tamanho 11, cpf invalido
        int carac_cpf;

        // percorrer o cpf ate os 9 primeiros digitos
        for (int i = 0; i < 9; i++){ // 9 == in_cpf.length()-2
            carac_cpf = caracteresParaInteiro(""+cpf_limpo.charAt(i));
            somadv1 += carac_cpf * (i + 1); // x*1 + x*2... obs: i tem q ir ate 9
            somadv2 += carac_cpf * i; // x*0 + x*1... obs: i tem q ir ate 10

            if (i==8) { // fazer a ultima soma do dv2
                somadv2 += caracteresParaInteiro(""+cpf_limpo.charAt(i+1))*(i+1);
                // pegar os digitos verificadores
                digitodv1 = caracteresParaInteiro(""+cpf_limpo.charAt(i+1)); // digito na posicao 10
                digitodv2 = caracteresParaInteiro(""+cpf_limpo.charAt(i+2)); // digito na posicao 11
            }
        }

        somadv1 = somadv1%11 == 10 ? somadv1%11 -10 : somadv1%11; // se o resto da divisao por 11 for 10, considerar 0
        somadv2 = somadv2%11 == 10 ? somadv2%11 -10 : somadv2%11;

        if (somadv1 == digitodv1 && somadv2 == digitodv2){
            return true;
        } 
        return false;
    }


    public static String substituirSubfraseTodas(String frase, String fraseDe, String frasePara){
        int ultima_pos = 0;
        String saida="", palavra;

        for (int i = 0; i < frase.length()-fraseDe.length(); i++){//ACCBBC
            palavra = frase.substring(i, i +fraseDe.length());
            if (palavra.equals(fraseDe)){
                saida+= frase.substring(ultima_pos, i) + frasePara;
                ultima_pos = i+fraseDe.length();
            }
            
        }

        return saida+= frase.substring(ultima_pos, frase.length());//ABBBBB
    }

    public static String cifrarCesar(String texto, int n, boolean cifrar){
        String saida = "";
        texto = texto.toUpperCase();
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (cifrar){
                saida+=(char) ((c -65 +n)%26 +65);
            } else {
                saida+=(char) ((c -65 -n +26)%26 +65);
            }
        }
        return saida;
    }
}
