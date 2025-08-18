/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas Pernas? ");
        int pernas = entrada.nextInt();
        String tipo;
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípedi";
                break;
            case 4:
                tipo = "Quadrúpedi";
                break;
            case 6, 8:
                tipo = "Aracnideo";
                break;
            default:
                tipo = "Et";
        }
        System.out.println(tipo);
    }
    
}
