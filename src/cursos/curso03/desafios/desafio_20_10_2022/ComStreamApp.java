package cursos.curso03.desafios.desafio_20_10_2022;

import java.util.ArrayList;
import java.util.List;

public class ComStreamApp {
    static List<String> funcionarios = new ArrayList<>();  // static List<String> funcionarios;

    public static void filtrar(String letra) {
        funcionarios.stream().filter(s ->
                s.startsWith(letra)).forEach(System.out::println);
    }

    public static void ordenar(String letra) {
        funcionarios.stream().sorted().filter(s ->
                s.startsWith(letra)).forEach(System.out::println);
    }

    public static void contar(String letra) {
        long contador = funcionarios.stream().filter(s ->
                s.startsWith(letra)).count();
                System.out.println(contador);
    }

    public static void main(String[] args) {
       //funcionarios = new ArrayList<>();
        funcionarios.add("Antonio");
        funcionarios.add("Jose");
        funcionarios.add("Pedro");
        funcionarios.add("Joao");
        funcionarios.add("Andreia");
        //contar("A");
        //filtrar("A");
        ordenar("J");

    }
}
