import java.util.Scanner;

public class MostraValores {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.print("Digite a quantidade de linhas: ");
        int linhas = read.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int colunas = read.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Insira os valores");
        for (int i = 0; i < linhas; i++) {
            for (int ii = 0; ii < colunas; ii++) {
                System.out.printf("Informe o valor da posição (%d, %d): ", i, ii);
                matriz[i][ii] = read.nextInt();
            }
        }


        System.out.println("Matriz original:");
        for (int i = 0; i < linhas; i++) {
            for (int ii = 0; ii < colunas; ii++) {
                System.out.print(matriz[i][ii] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz com valores nos perímetros:");
        for (int i = 0; i < linhas; i++) {
            for (int ii = 0; ii < colunas; ii++) {
                if (i == 0 || i == linhas - 1 || ii == 0 || ii == colunas - 1) {
                    System.out.print(matriz[i][ii] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}







