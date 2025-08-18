/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorialclasse;

/**
 *
 * @author PC
 */
public class FatorialClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial ft = new Fatorial();
        ft.valor(5);
        System.out.print(ft.mostraFormula());
        System.out.println(ft.mostraFactorial());
    }
    
}
