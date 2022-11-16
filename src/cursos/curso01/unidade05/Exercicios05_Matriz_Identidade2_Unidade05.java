package cursos.curso01.unidade05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicios05_Matriz_Identidade2_Unidade05 {
    public static void main(String[] args) throws IOException {
        int[][] MI = new int[3][3];
        int i, j;

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if (i == j) {
                    MI[i][j] = 1;
                } else {
                    MI[i][j] = 0;
                }
            }
        }

        FileWriter arqMatriz = new FileWriter("matriz.txt");
        PrintWriter gravarMatriz = new PrintWriter(arqMatriz);

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                gravarMatriz.print(MI[i][j] + " ");
            }
        }
        arqMatriz.close();
        gravarMatriz.close();

    }
}