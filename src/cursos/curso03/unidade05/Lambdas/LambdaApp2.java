package cursos.curso03.unidade05.Lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaApp2 {
    int somatorio;

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        LambdaApp2 app = new LambdaApp2();

        integers.forEach(x -> {
            x = x + 10;

            app.somatorio = app.somatorio + x;
            System.out.println(x);
        });

        System.out.println("\n" + app.somatorio);

    }
}
