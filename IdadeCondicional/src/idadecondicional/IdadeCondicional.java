/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idadecondicional;

import java.time.YearMonth;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class IdadeCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int anoAtual = YearMonth.now().getYear();
        System.out.print("Digite o Seu Ano de Nascimento: ");
        int anoNascimento = entrada.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua Idade é " + idade);
        if(idade >=18){
            System.out.println("Você é Maior de Idade");
        }else{
            System.out.println("Você é Menor de Idade");
        }
                
    }
    
}
