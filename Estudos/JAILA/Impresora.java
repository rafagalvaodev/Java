import java.util.Scanner;
public class Impresora {
    public static String printer_error(String texto){
        int erros = 0;
        int tamanhoTexto = texto.length();
        for(int i = 1; i< tamanhoTexto; i++){
            char letraAtual = texto.charAt(i);
            char letraAnterior = texto.charAt(i-1);
            if(letraAtual < letraAnterior){
                erros++;
                for(int ii = i; ii+1 < tamanhoTexto; ii++){
                    char letraSeguinte = texto.charAt(ii+1);
                    if(letraAtual == letraSeguinte){
                        erros++;
                        ii++;
                    }
                }
            }
        }
        return erros+"/"+tamanhoTexto;
    }

    public static void main(String[] args) {
        String txt;
        Scanner read = new Scanner(System.in);
        System.out.print("Insira o codigo: ");
        txt = read.next();
        System.out.println(printer_error(txt));
    }
}

