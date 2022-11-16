package cursos.curso01.desafio_29_09_2022.Desafio02;

import java.util.Scanner;

public class questao02SomaNumeroRecursividade2 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int soma = 0, s = 0;

        System.out.print("Informe um valor: ");
        int numero = ent.nextInt();

        for (int i = 0; i < 5; i++ ) {
            numero = s;
            s = s + 1;

            System.out.print(s + " ");
            soma = soma + s;
        }
        System.out.print("\nSoma de todos os valores inteiros positivos: " + soma);
    }
}
