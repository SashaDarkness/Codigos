/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursos.curso01.unidade02.versao_Scanner;

import java.util.Scanner;

public class Exercicios02_Calculo_Viajem_HorasDias_Unidade02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int hora = 24;  //contante           
        // 1 dia = 24 horas
        // 2 dias = x horas
        // 1 * x = 2 * 24
        // x = 2 * 24 / 1                       
        System.out.println("Quantos dias durou a viagem? : ");
        int dias_viagem = scan.nextInt();

        int conversao_dias = dias_viagem * hora;
        System.out.println("Duração da viagem foi de: " + conversao_dias + " horas");

         // 1 dia = 24 horas    
         // x dias = 72 horas
         // x * 24 = 1 * 72
         // x = 1 * 72 / 24       
        System.out.println("\nQuantas horas durou a viagem? : ");
        int horas_viagem = scan.nextInt();
        
        int conversao_horas = horas_viagem / hora;
        System.out.println("Duração da viagem foi de: " + conversao_horas + " dias");
        
    }
    
}
