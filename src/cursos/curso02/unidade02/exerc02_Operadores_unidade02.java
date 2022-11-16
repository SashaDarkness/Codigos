package cursos.curso02.unidade02;

import java.util.Scanner;

public class exerc02_Operadores_unidade02 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double num1, num2, soma, subtracao, multiplicacao, divisao;

        System.out.print("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = input.nextInt();

        System.out.println("\nResultado das Operações:");
        System.out.println("Soma: " + (num1 + num2) );
        System.out.println("Subtração: " + (num1 - num2) );
        System.out.println("Multiplicação: " + (num1 * num2) );
        System.out.println("Divisão: " + (num1 / num2) );

    }
}
