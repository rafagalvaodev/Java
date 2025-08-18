/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votacao;

import java.time.YearMonth;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Votacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int anoAtual = YearMonth.now().getYear();
        System.out.print("Digite seu Ano de Nascimento: ");
        int anoNascimento = entrada.nextInt();
        int idade = anoAtual - anoNascimento;
        if(idade<16){
            System.out.println("Não vota");
        }else{
            if((idade>=16 & idade<18)|(idade>70)){
                System.out.println("Opcional Votar");
            }else{
                System.out.println("Obrigatorio Votar");    
            }
        }
    }
    
}
