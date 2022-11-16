package cursos.curso03.unidade05.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
    static List<String> funcionarios; //= new ArrayList<>();

    public static void filtrar(String letra){
        /*
        for(String filtrar : funcionarios){
            if (filtrar.startsWith(letra)) {
                System.out.println(filtrar);
            }
        }
        */
        funcionarios.stream().filter(a ->
                a.startsWith(letra)).forEach(System.out::println);
    }

    public static void ordenar(String letra) {
        long contador = funcionarios.stream().sorted().filter(s ->
                s.startsWith(letra)).count();

        System.out.println(contador);
    }

    public static void contar(String letra) {
        funcionarios.stream().sorted().filter(s ->
                s.startsWith(letra)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        funcionarios = new ArrayList<>();

        funcionarios.add("Antonio");
        funcionarios.add("Jose");
        funcionarios.add("Pedro");
        funcionarios.add("Joao");
        funcionarios.add("Andre");
        contar("A");
        filtrar("A");
        ordenar("J");
    }

}
