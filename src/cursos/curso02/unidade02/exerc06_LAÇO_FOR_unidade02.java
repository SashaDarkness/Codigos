package cursos.curso02.unidade02;

import java.util.Arrays;

public class exerc06_LAÇO_FOR_unidade02 {
    public static void main(String[] args) {

        System.out.println("CONTAGEM DE 0 A 100 COM O LAÇO FOR:");
        for (int i = 0; i < 101; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n\n");
        int numeros[] = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int x : numeros){
            soma = soma + x;
        }
        System.out.println("Números: " + Arrays.toString(numeros) + "\nSoma: " + soma);

    }
}
