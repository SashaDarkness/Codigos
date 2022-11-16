package cursos.curso03.unidade05.Streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        colecaoStream();
        System.out.println("\n-------------------------\n");
        colecaoParallelStream();
    }

    private static void colecaoParallelStream() {
        List<String> valores = new ArrayList<>();
        int max=1_000_000;

        for (int i = 0; i < max; i++){
            valores.add("-> " + i );
        }

        long tempo1 = System.currentTimeMillis();

        //System.out.println(valores);
        valores.parallelStream().sorted().forEach(System.out::println);

        long tempo2 = System.currentTimeMillis();

        System.out.println("Tempo de execucao: " + (tempo1 - tempo2));

    }


    private static void colecaoStream() {
        List<String> valores = new ArrayList<>();
        int max=1_000_000;

        for (int i = 0; i < max; i++){
            valores.add("-> " + i );
        }

        long tempo1 = System.currentTimeMillis();

        //System.out.println(valores);
        valores.stream().sorted().forEach(System.out::println);

        long tempo2 = System.currentTimeMillis();

        System.out.println("Tempo de execucao: " + (tempo1 - tempo2));

    }

}
