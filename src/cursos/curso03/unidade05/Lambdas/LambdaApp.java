package cursos.curso03.unidade05.Lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        /*
        for(Integer x : integers){
            x += 10;
            System.out.println(x);
        }
        */

        //Expressao Lambda - forEach(); Aceita expressoes anonimas.
        // x é uma expressão anonima.

        integers.forEach(x -> System.out.println(x));

    }
}
