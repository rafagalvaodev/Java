import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjuto = new TreeSet<>();

        Set<String> conjunto = new HashSet<>();

        Set<String> conj = new LinkedHashSet<>();

        conjuto.add("Olá");
        conjuto.add("Mundão");

        conjuto.add("\n");
        conjuto.add("Carlos");
        conjuto.add("Carlos");
        conjuto.add("Karla");
        conjuto.add("Victoria");

        conjunto.add("Olá");
        conjunto.add("Mundão");



        conj.add("Olá");
        conj.add("Mundão");

     //  System.out.println(conjuto);

        for (String e : conjuto){
            System.out.println(e);
        }

        System.out.println();

        conjuto.forEach(System.out::println);

        System.out.println("Elemestos do HashSet");

        conjunto.forEach(System.out::println);

        System.out.println("Elemestos do LinkedHashSet");

        conj.forEach(System.out::println);

    }
}
