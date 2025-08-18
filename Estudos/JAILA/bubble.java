public class bubble {
    public static void main(String[] args) {
        int[] vetorInteiro = {1,3,5,6,10,32,2,51,31};
        bubble(vetorInteiro);
        for (int i = 0; i < vetorInteiro.length; i++) {
            System.out.println("Número " + i + " = " + vetorInteiro[i]);
        }
    }

    public static void bubble(int[] valor) {
        int total = valor.length;
        boolean troca;

        for (int i = 0; i < total - 1; i++) {
            troca = false;

            for (int j = 0; j < total - i - 1; j++) {
                if (valor[j] > valor[j + 1]) {
                    // Swap valor[j] and valor[j + 1]
                    int temporario = valor[j];
                    valor[j] = valor[j + 1];
                    valor[j + 1] = temporario;

                    troca = true;
                }
            }

            if (!troca) {
                break;
            }
        }
    }
}