import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int codigoPeca1 = sc.nextInt();
        int quantidadePecas1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int quantidadePecas2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double total = (valorPeca1 * quantidadePecas1) + (valorPeca2*quantidadePecas2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }
}