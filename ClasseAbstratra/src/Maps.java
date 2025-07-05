import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Idade", "31");
        map.put("Nome", "Diego");
        map.put("Sobrenome", "Flores");
        map.entrySet().forEach(System.out::println);


    }
}
