import java.util.Scanner;

public class MatrizOrdenadas {
    private static void matrizCrescente(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int ii = 0; ii < matriz[i].length; ii++) {
                for (int iii = 0; iii < matriz[i].length; iii++) {
                    if (matriz[i][ii] < matriz[i][iii]) {
                        int temp = matriz[i][ii];
                        matriz[i][ii] = matriz[i][iii];
                        matriz[i][iii] = temp;
                    }
                }
            }
        }
        for (int[] i : matriz) {
            for (int ii : i) {
                System.out.printf("%d ", ii);
            }
            System.out.println();
        }
    }
    private static void matrizDecrescente(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int ii = 0; ii < matriz[i].length; ii++) {
                for (int iii = 0; iii < matriz[i].length; iii++) {
                    if (matriz[i][ii] > matriz[i][iii]) {
                        int temp = matriz[i][ii];
                        matriz[i][ii] = matriz[i][iii];
                        matriz[i][iii] = temp;
                    }
                }
            }
        }
        for (int i = matriz.length - 1; i>=0; i--) {
            for (int ii = 0; ii < matriz[i].length; ii++) {
                System.out.printf("%d ", matriz[i][ii]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas: ");
        int linhas = read.nextInt();
        int[][] valorMatriz = new int[linhas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int ii = 0; ii < linhas; ii++) {
                System.out.printf("Informe o valor da posição (%d, %d): ", i, ii);
                valorMatriz[i][ii] = read.nextInt();
            }
        }

        System.out.println("Como deseja ordenar, De forma crescente ou decrescente: ");
        String opcao = read.next().toLowerCase();
       // opcao.charAt(0);
        if(opcao.equals("crescente")){
            matrizCrescente(valorMatriz);
        }else if(opcao.equals("decrescente")){
            matrizDecrescente(valorMatriz);
        }else{
            System.out.println("Opção invalida");
        }

    }
}
