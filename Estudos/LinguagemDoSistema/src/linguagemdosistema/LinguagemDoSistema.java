package linguagemdosistema;

import java.util.Locale;

public class LinguagemDoSistema {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.print("O Idioma do Sitema é: ");
        System.out.println(local.getDisplayLanguage());
    }
    
}
