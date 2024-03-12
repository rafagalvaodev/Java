import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        double compras=0;
        int opcoes=0;
        Scanner read = new Scanner(System.in);

        while (true){
            System.out.println("1. Arroz - 8 USD\n2. Feijão - 10 USD\n3. Batata - 15 USD\n4. Carne - 100 USD\n0. Sair");
            System.out.print("Digite uma opção: ");
            opcoes = read.nextInt();
            switch (opcoes){
                case 1:
                    compras+=8;
                    break;
                case 2:
                    compras+=10;
                    break;
                case 3:
                    compras+=15;
                    break;
                case 4:
                    compras+=100;
                    break;
                case 0:
                    System.out.printf("O valor é R$%.2f",compras);
                    break;
                default:
                    System.out.println("Valor invalido");

            }

            if(opcoes==0){
                break;
            }
        }
    }
}
