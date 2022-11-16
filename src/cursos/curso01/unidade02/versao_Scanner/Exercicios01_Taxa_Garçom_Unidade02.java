/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursos.curso01.unidade02.versao_Scanner;

import java.util.Scanner;

public class Exercicios01_Taxa_Garçom_Unidade02 {

    public static void main(String[] args) {
        double valor, valor_final, taxa = 0.10;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do jantar: ");
        valor = entrada.nextDouble();
        
        valor_final = valor + (valor * taxa);
        System.out.println("Valor total a ser pago: R$" + valor_final);
        
    }
    
}
