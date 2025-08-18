import java.util.Scanner;

public class Carvao {
    public static void main(String[] args) {
        int dureza;
        float teor;
        double resistencia;

        Scanner read = new Scanner(System.in);
        System.out.print("Digite a dureza: ");
        dureza = read.nextInt();

        System.out.print("Digite o teor: ");
        teor = read.nextFloat();

        System.out.print("Digite a tração: ");
        resistencia = read.nextDouble();

        if(dureza>50 && teor<0.7f && resistencia>5600){
            System.out.println("A pontuação é 10. ");
        } else if (dureza>50 && teor<0.7f) {
            System.out.println("A pontuação é 9. ");
        } else if (teor<0.7f && resistencia>5600) {
            System.out.println("A pontuação é 8. ");
        } else if (dureza>50 && resistencia>5600) {
            System.out.println("A pontuação é 7. ");
        } else if (dureza>50 || teor<0.7f || resistencia>5600) {
            System.out.println("A pontuação é 6. ");
        }else {
            System.out.println("A pontuação é 5. ");
        }
    }
}
