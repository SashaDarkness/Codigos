package cursos.curso02.unidade02;

public class exerc10_Vetor50Elementos_unidade02 {
    public static void main(String[] args) {
        int[] A = new int[50];
        int[] B = new int[50];

        for (int i = 0; i < 50; i++){
            A[i] = i;
            if (i % 2 == 0) {
                B[i] = A[i] * 2;
            } else  {
                B[i] = A[i] / 2;
            }
        }

        for (int a : A){
            System.out.println(a);
        }
        System.out.println(" ");

        for (int b : B) {
            System.out.println(b);
        }
    }
}
