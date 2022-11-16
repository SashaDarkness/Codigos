package cursos.curso02.DesafiosNaAula;

import java.util.Scanner;

public class SerieHarmonica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double total = 0;
        for (int i = 1; i <= n; i++){
            total += 1/(double) i;
        }
        System.out.println(total);
    }
}