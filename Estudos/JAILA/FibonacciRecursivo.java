import java.util.Scanner;

public class FibonacciRecursivo {
    public static int fatorial(int valor){
        if(valor==0){
            return 0;
        }else if(valor==1){
            return 1;
        }else {
            return fatorial(valor-1)+fatorial(valor-2);
        }
    }


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        int numero = read.nextInt();

        for (int i = numero; i > 0; i--) {
            if(i<numero-1){
                System.out.print(fatorial(i)+ " ");
            }
        }
        System.out.println("= "+ fatorial(numero));
    }
}
