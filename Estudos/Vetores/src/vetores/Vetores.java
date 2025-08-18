/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

/**
 *
 * @author PC
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String meses[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int contador = 0; contador<meses.length; contador++){
            System.out.println("O Mes de "+meses[contador]+" Tem "+dias[contador] +" Dias");
        }
    }
    
}
