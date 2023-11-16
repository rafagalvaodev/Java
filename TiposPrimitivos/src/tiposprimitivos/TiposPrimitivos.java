package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite Sua Nota: ");
        float nota = entrada.nextFloat();
        System.out.format("A Nota de %s é %.2f \n", nome,nota);
    }
    
}
