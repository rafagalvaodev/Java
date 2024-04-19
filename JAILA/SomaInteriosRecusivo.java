import java.util.Scanner;

public class SomaInteriosRecusivo {

    public static int somaInteiros(int numeros){
        if(numeros == 0){
            return 0;
        }
        return (numeros % 10 + somaInteiros(numeros/10));
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor Inteiro positivo: ");
        int valor = read.nextInt();

        if(valor<=0){
            System.out.println("Número invalido");
        }else{
            int soma = somaInteiros(valor);
            String digitos =String.valueOf(valor);
            for (int i = 0; i<digitos.length(); i++ ){
                int digito = digitos.charAt(i) - '0';
                System.out.print(digito);
                if (i<digitos.length() - 1){
                    System.out.print(" + ");
                }else {
                    System.out.print(" = ");
                }
            }
            System.out.println(soma);
        }

    }
}
