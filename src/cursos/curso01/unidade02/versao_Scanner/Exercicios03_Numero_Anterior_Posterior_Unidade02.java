/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursos.curso01.unidade02.versao_Scanner;

import java.util.Formatter;
import java.util.Scanner;

public class Exercicios03_Numero_Anterior_Posterior_Unidade02 {

    public static void main(String[] args) {
        Formatter fmt = new Formatter(System.out);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int numero = scan.nextInt();
        
        fmt.format("Número digitado: %d",numero);
        System.out.println("\nAnterior:"+ (numero - 1) +
                "\nPosterior: " + (numero + 1));
        
    }
    
}
