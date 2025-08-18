import java.util.Scanner;

public class MultiplicaMatriz {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];

        System.out.println("Digite os valores da primeira matriz: ");
        preencherMatriz(matrizA, read);
        System.out.println("Digite os valores da segunda matriz: ");
        preencherMatriz(matrizB, read);

        if (!validarMultiplicacao(matrizA, matrizB)) {
            System.out.println("**A multiplicação das matrizes não é possível!**");
            return;
        }

        int[][] matrizC = multiplicarMatrizes(matrizA, matrizB);

        System.out.println("Matriz resultante da multiplicação:");
        imprimirMatriz(matrizC);
    }

    private static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int ii = 0; ii < matriz[i].length; ii++) {
                System.out.printf("Digite o valor para a linha %d, coluna %d: ", i + 1, ii + 1);
                matriz[i][ii] = scanner.nextInt();
            }
        }
    }

    private static boolean validarMultiplicacao(int[][] matrizA, int[][] matrizB) {
        return matrizA[0].length == matrizB.length;
    }

    private static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int[][] matrizC = new int[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizC.length; i++) {
            for (int ii = 0; ii < matrizC[i].length; ii++) {
                for (int iii = 0; iii < matrizA[0].length; iii++) {
                    matrizC[i][ii] += matrizA[i][iii] * matrizB[iii][ii];
                }
            }
        }
        return matrizC;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] i : matriz) {
            for (int ii : i) {
                System.out.printf("%d ", ii);
            }
            System.out.println();
        }
    }
}
