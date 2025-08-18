import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        int valor;
        int passos = 0;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número interiro: ");
        valor = read.nextInt();
        System.out.print(valor+" ");
        for (int i = valor; i>=0; i--){
            if(valor==1){
                break;
            }
            if(valor%2==0){
                valor = valor/2;
            } else{
                valor = valor*3+1;

            }
            passos++;
            System.out.print(valor+" ");


        }
        System.out.println("\nForam "+passos+" passos ");
    }
}
