import java.util.Scanner;

public class QuantidadeVogais {
    public static void main(String[] args) {
        int vogais = 0;
        int consoantes = 0;
        //char[] letras = {'a','b','c','d','e','g'};
        //char[] letras = {'a', 'c', 'd', 'h', 'z', 'k', 'm', 'r', 'x', 'y'};
        char[] letras = {'a', 'b', 'e', 'g', 'j', 'o', 's', 'u', 'x', 'z'};
        for(int i=0; i<letras.length;i++){
            if(letras[i]=='a' || letras[i]=='e' || letras[i]=='i' || letras[i]=='o' || letras[i]=='u'){
                vogais++;
            }else {
                consoantes++;
            }
        }
            System.out.print("Total de letra: "+letras.length+"\nVogais presentes: " + vogais + "\nConsoantes Presentes: "+consoantes);
    }
}
