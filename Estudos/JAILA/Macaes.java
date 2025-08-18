import java.util.Scanner;

public class Macaes {
    public static void main(String[] args) {
        double valor1 = 1.30;
        double valor2 = 1;
        int quantidade;
        double resultado;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a quantidade de maçães: ");
        quantidade = read.nextInt();

        if(quantidade<12){
            resultado = quantidade*valor1;
            System.out.printf("O valor a pagar por "+quantidade+" Maçães é R$ %.2f ",resultado);
        } else if (quantidade>=12) {
            resultado = quantidade*valor2;
            System.out.printf("O valor a pagar por "+quantidade+" Maçães é R$ %.2f",resultado);
        }
    }
}
