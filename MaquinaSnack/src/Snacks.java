import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Tubaina", 13.50));
        snacks.add(new Snack("Biscoito", 3.99));
        snacks.add(new Snack("Gostositos", 23.70));

    }

    public static void adicionarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        StringBuilder sb = new StringBuilder();

        for (Object snack : snacks){
            sb.append(snack.toString());
            sb.append("\n");
        }
        System.out.println("Snacks no inventario");
        System.out.println(sb);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }

}
