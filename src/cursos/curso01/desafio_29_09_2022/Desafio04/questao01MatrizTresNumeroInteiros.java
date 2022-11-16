package cursos.curso01.desafio_29_09_2022.Desafio04;
import java.util.Scanner;
//Dada uma Matriz M 3x3 de números inteiros, identificar qual o maior número e qual o menor número.
public class questao01MatrizTresNumeroInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0, menor = 0;
        int[][] M = new int[3][3];

        System.out.println("Informe os valores para Matriz:");
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + j + "]: ");
                M[i][j] = input.nextInt();

                if (M[i][j] > maior) {
                    maior = M[i][j];
                }
                if (M[i][j] < menor) {
                    menor = M[i][j];
                }
            }
        }
        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
    }
}
