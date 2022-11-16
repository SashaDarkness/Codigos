package cursos.curso03.teste;

import java.util.Arrays;
import java.util.List;

public class lambda {
    public static void main(String[] args){
        List<Integer> integers = Arrays.asList(1,2,3,4);

        for(Integer x: integers)
            System.out.println(x);

        integers.forEach (x -> System.out.println(x));

        integers.forEach(System.out::println);


        integers.forEach((Integer x) ->
        {
            int y = x/2;

            System.out.println(y);

        });;

    }
}
