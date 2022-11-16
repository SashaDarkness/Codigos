/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursos.curso01.unidade02.versao_Scanner;

import java.util.Scanner;

public class Exercicios04_Jantar_Pizzaria_Unidade02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor da Pizza? : ");
        double valor = scan.nextDouble();
        System.out.println("Quantas pessoas vão pagar? : ");
        int pessoas = scan.nextInt();
        
        double total_conta = valor / pessoas ;
        
        System.out.println("\nValor final a ser pago: " + total_conta
        + "\nTotal de pessoas que vão pagar:" + pessoas);
    }
    
}
