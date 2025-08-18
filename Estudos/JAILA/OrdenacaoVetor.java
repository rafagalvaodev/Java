import java.util.Scanner;

public class OrdenacaoVetor {
    public static void bubble(int[] valor) {
        int total = valor.length;
        boolean troca;

        for (int i = 0; i < total - 1; i++) {
            troca = false;

            for (int ii = 0; ii < total - i - 1; ii++) {
                if (valor[ii] > valor[ii + 1]) {
                    int temporario = valor[ii];
                    valor[ii] = valor[ii + 1];
                    valor[ii + 1] = temporario;

                    troca = true;
                }
            }

            if (!troca) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] vetorInteiros = {1,17,51,31,3,37,2,5,6};
        int[] vetorUser = new int[10];
        Scanner read = new Scanner(System.in);
        System.out.println("Digite 10 números aleatorios");
        for(int i =0; i<vetorUser.length; i++){
            System.out.print("Digite o valor da posição "+(i+1)+": ");
            vetorUser[i] = read.nextInt();

        }
        bubble(vetorUser);
        for(int i = 0; i < vetorUser.length; i++){
            System.out.println("Número " + (i+1) +" = "+ vetorUser[i]);
        }
    }
}
