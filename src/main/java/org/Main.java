//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//        Número Inteiros
//        byte => 8 bits => -128 a 127 Economiza espaço na memória
//        short => 16 bits => -32.768 a 32.767
//        int => 31 bits => 2.147.483 a 2.147.484.657
//        long => 64 bits
//
//        //Números Decimais
//        float => 32 Precisao simples
//        double => 64  Precisao Simples
//
//        Strings Palavras e frases
//        char => Um único caracter => a,b,c,d
//        boolean => true false;

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;  //Tem que ter o L
        float f = 10.5f;   //Tem que ter o f
        double d = 20.5;
        char c = 'A';
        String str = "Feyre"; //String classe dentro do JAVA Cor branca
        boolean bool = true;

        if (bool) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (str.equals ("Feyre")){
            System.out.println("True");
        } else if (str.isBlank()) {
            System.out.println("False");
        }

        //Vetor Coleção
        int[] colecaoDeInt = {1,2,3,4,5,6,7,8,9,10}; //Vetor com tamanho fixo
        System.out.println(colecaoDeInt.length);
        System.out.println(colecaoDeInt[5]);







    }
}