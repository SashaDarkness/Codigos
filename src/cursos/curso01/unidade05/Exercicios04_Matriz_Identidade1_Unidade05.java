package cursos.curso01.unidade05;

public class Exercicios04_Matriz_Identidade1_Unidade05 {
    public static void main(String[] args) {
        int[][] M = new int[3][3];
        int i, j;

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if (i == j) {
                    M[i][j] = 1;
                } else {
                    M[i][j] = 0;
                }
            }
        }

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(M[i][j] + " ");
            }
        }

    }
}