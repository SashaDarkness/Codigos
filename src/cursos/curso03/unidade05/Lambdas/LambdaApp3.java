package cursos.curso03.unidade05.Lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaApp3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.forEach((Integer x) -> {
            x += 10;
            System.out.println(x);
        });
    }
}
