import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {

    //pegar localização atual
    Locale pegarLocalizacao = Locale.getDefault();

        //pegar país
        System.out.println(pegarLocalizacao.getCountry());
        //pegar Linguagem
        System.out.println(pegarLocalizacao.getDisplayLanguage());


    }
}
