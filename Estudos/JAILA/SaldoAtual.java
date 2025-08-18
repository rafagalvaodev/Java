import java.util.Scanner;

public class SaldoAtual {
    public static void main(String[] args) {
        int numeroConta;
        double saldoAtual,saldo, debito, credito;

        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        numeroConta = read.nextInt();

        System.out.print("Digite o seu saldo: ");
        saldo = read.nextDouble();

        System.out.print("Digite o valor do seu debito: ");
        debito = read.nextDouble();

        System.out.print("Digite o valor do seu credito: ");
        credito = read.nextDouble();

        saldoAtual = saldo-debito+credito;

        if(saldoAtual>=0){
            System.out.println("Saldo positivo para a conta Nº "+numeroConta);
            System.out.printf("Total em conta: R$ %.2f",saldoAtual);

        }else{
            System.out.println("Saldo negativo para a conta Nº "+numeroConta);
            System.out.printf("Total em conta: R$ %.2f",saldoAtual);
        }
    }
}
