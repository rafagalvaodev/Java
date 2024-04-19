import java.util.Scanner;

public class MacaesOperadorTernario {
    public static void main(String[] args) {
        double valor1 = 1.30;
        double valor2 = 1;
        int quantidade;
        double resultado, resultado2;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a quantidade de maçães: ");
        quantidade = read.nextInt();
        resultado = quantidade*valor1;
        resultado2 = quantidade*valor2;
        String texto1 = "O valor a pagar por "+quantidade+" Maçães é R$ " +resultado;
        String texto2 = "O valor a pagar por "+quantidade+" Maçães é R$ " + resultado2;
        String textoFinal = (quantidade<12)? texto1 : texto2;
            System.out.printf(textoFinal);
    }
}
