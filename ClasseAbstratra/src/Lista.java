import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List lista = new ArrayList();

        StringBuilder stringBuilder = new StringBuilder();


        lista.add("Olá");
        lista.add("Mundão");

        stringBuilder.append("Olá");
        stringBuilder.append(" Mundão");
        stringBuilder.append("!");


        System.out.println(lista);
        System.out.println(stringBuilder);

        for (Object s : lista){
            System.out.print(s + " ");
        }

    }
}
