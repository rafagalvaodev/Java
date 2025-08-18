/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatorialclasse;

/**
 *
 * @author PC
 */
public class Fatorial {
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void valor(int num){
        numero = num;
        int fac = 1;
        String soma = "";
        for(int contador = num; contador > 1; contador--){
            fac *= contador;
            soma += contador + " X ";
        }
        soma += "1 = ";
        fatorial = fac;
        formula = soma;
                
    }
    
    public int mostraFactorial(){
        return fatorial;
    }
    
    public String mostraFormula(){
        return formula;
    }
    
}
