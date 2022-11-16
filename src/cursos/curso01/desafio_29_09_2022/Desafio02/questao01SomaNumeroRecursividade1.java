package cursos.curso01.desafio_29_09_2022.Desafio02;

import java.util.Scanner;

public class questao01SomaNumeroRecursividade1 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int soma = 0, i = 1;

        System.out.print("Informe um valor: ");
        int numero = ent.nextInt();

        while (numero >= i) {
            soma += i;
            i += 1;
            System.out.print(i - 1 + " ");
        }
        System.out.print("\nSoma de todos os valores inteiros positivos: " + soma);
    }
}
