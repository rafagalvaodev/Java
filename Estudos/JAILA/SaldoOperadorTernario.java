import java.util.Scanner;

public class SaldoOperadorTernario {
    public static void main(String[] args) {
        int numeroConta;
        double saldoAtual, saldo, debito, credito;

        Scanner read = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        numeroConta = read.nextInt();

        System.out.print("Digite o seu saldo: ");
        saldo = read.nextDouble();

        System.out.print("Digite o valor do debito: ");
        debito = read.nextDouble();

        System.out.print("Digite o valor do credito: ");
        credito = read.nextDouble();

        saldoAtual = saldo-debito+credito;

        System.out.println("Conta de Nº "+numeroConta);
        String resultado = (saldoAtual>0)? "Saldo Positivo" : "Saldo Negativo";
        System.out.println(resultado);
    }
}
