import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int numero = read.nextInt();

        switch (numero){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feria");
                break;
            case 4:
                System.out.println("Quarta-Feria");
                break;
            case 5:
                System.out.println("Quinta-Feria");
                break;
            case 6:
                System.out.println("Sexta-Feria");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Número invalido");
        }
    }
}
