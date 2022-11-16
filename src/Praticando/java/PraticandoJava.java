/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praticando.java;

import java.util.Formatter;
import java.util.Scanner;
class PraticandoJava {
    public static void main(String[] args) {
        //https://pt.wikibooks.org/wiki/Java/Math
        String word = "informe o";
         
        Formatter fmt = new Formatter(System.out);
        Scanner scan = new Scanner(System.in);
        
        String message = String.format("%s primeiro número: ", word);
        System.out.printf("%s%n%s","abaixo...",message );  
        double n1 = scan.nextDouble();
      
        fmt.format("n1 é %2f ", n1);  
        
        System.out.println("\n\t-------------------------\r");
        System.out.println("Exponecia de 3^2: " + Math.pow(3, 2));
        System.out.println("Adicionando \"aspas\" dentro das aspas"); 
           
     
        

       
                
    }
    
}
