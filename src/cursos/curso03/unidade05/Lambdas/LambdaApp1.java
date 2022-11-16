package cursos.curso03.unidade05.Lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaApp1 {
    static int num;

    public static void main(String[] args) {
        int numero = 10;
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.forEach(x -> {
            //x += numero;
            num = 10;
            x = x + num;
            System.out.println(x);
        });

    }
}
