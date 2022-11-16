package cursos.curso02.unidade02;

public class exerc11_MatrizIdentidade_unidade02 {
    public static void main(String[] args) {
        int[][] M = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (i != j) {
                    M[i][j] = 0;
                } else {
                    M[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}