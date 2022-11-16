/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursos.curso01.unidade02.versao_Scanner;

import java.util.Scanner;

public class Exercicios06_AlunoMedia_Nota_Unidade02 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);   
       
        System.out.println("Informe a 1º nota");
        double nota01 = scan.nextDouble();   
        System.out.println("Informe a 2º nota");
        double nota02 = scan.nextDouble();   
        System.out.println("Informe a 3º nota");
        double nota03 = scan.nextDouble();   
        System.out.println("Informe a 4º nota");
        double nota04 = scan.nextDouble();   

        double media = (nota01+ nota02 + nota03 + nota04) / 4;      
        
        System.out.println("Média das notas: " + media);
        
    }
    
}
