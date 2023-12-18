/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repita;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Repita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, soma=0, contador_Par = 0, contador_Impar = 0, cem = 0, media = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um Valor:(Insira 0 Para Interomper)"));
            soma += numero;
            media = (soma + contador_Par + contador_Impar + cem) /4; 
            if (numero % 2 == 0){
                if (numero == 0){
                    contador_Par-=1;
                }
                contador_Par++;
            }
            if (numero % 2 != 0){
                contador_Impar++;
            }
            if (numero>=100){
                cem++;
            }
            
        } while(numero != 0);
        JOptionPane.showMessageDialog(null, "<html>Resuldado Final: <hr>" + "<br>A Soma total foi:   " + soma + " <br>Total de Pares foi:   " + contador_Par + "<br>Total de Impares foi:  " + contador_Impar + "<br>Total de Números Acima de 100:   " + cem + "<br>A Média dos Número é:  " + media + "</html>" );
    }
    
    
}
