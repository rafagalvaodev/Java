import java.util.Scanner;

public class Impressora {
    public static String printer_error(String texto){
        int cores = 0;
        int erros = 0;
        String letras = "";
        String texto2 ;

        for(int i = 0; i < texto.length(); i++){
            char caracterAtual = texto.charAt(i);
            letras += texto.charAt(i)+"";

            if(letras.charAt(i)<=texto.charAt(i+1)){
                if(letras.charAt(i)<=texto.charAt(i+1)){

                }
            }else{
                erros++;
            }
            cores++;

        }
        return erros+"/"+cores;
    }
    public static void main(String[] args) {
        String textoEntrada;
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o código: ");
        textoEntrada = read.next().toLowerCase();
        System.out.println(printer_error(textoEntrada));
    }
}
