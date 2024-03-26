import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        int valorInicial;
        int valorFinal;
        int soma=0;
        int quantidade=0;
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor Inicial: ");
        valorInicial = read.nextInt();
        System.out.print("Digite o valor Final: ");
        valorFinal = read.nextInt();

        for(int i = valorInicial; i<=valorFinal; i++){
            if(i%3==0){
                System.out.print(" "+i);
                quantidade+=1;
                soma+=i;
            }
        }
        System.out.println("\nA quantidade de multiplos é: "+quantidade);
        System.out.println("A soma é: "+soma);
    }
}
