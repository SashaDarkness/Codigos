/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursos.curso01.unidade02.versao_Scanner;

import java.util.Scanner;

public class Exercicios07_VideoLocadora_Filme_Unidade02 {
    public static void main(String[] args) {
        int horas, minutos, calcular;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o título do filme: ");
        String filme = scanner.nextLine();

        System.out.println("Informe o número de horas do filme: ");
        horas = scanner.nextInt();
        System.out.println("Informe o número de minutos do filme: ");
        minutos = scanner.nextInt();

        calcular = horas * 60 + minutos;

        System.out.println("\nTítulo do filme: " +filme+
                "\nDuração em minutos: " +calcular);

    }
}
