import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List lista = new ArrayList();

        lista.add("Olá");
        lista.add("Mundão");

        System.out.println("Função lambida");
        // Função lambida

        lista.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("Função com referencia?");

        // Função com referencia?
        lista.forEach(System.out::println);


    }
}
