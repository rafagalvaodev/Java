/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package média;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Média {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a Primeira Nota: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Digite a Segunda Nota: ");
        float nota2 = entrada.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println("A média é " + media);
        
        if(media>=7){
            System.out.println("Parabéns");
        
        }
    }
    
}
