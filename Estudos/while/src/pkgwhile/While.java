/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author PC
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador_Cambalhota = 1;
        while (contador_Cambalhota <= 10){
            contador_Cambalhota +=1;
           
            if (contador_Cambalhota % 2 != 0){
                continue;
            }
            
            System.out.println("Do a barrel roll " + contador_Cambalhota + " Times");
        }
        
        
    }
    
}
