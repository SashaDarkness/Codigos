package cursos.curso03.desafios.desafio_20_10_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SemStream {
     static List<String> funcionarios = new ArrayList<>();

    public static void filtrar(String letra) {
        for(String filtrar : funcionarios){
            if(filtrar.startsWith(letra)){
                System.out.println(filtrar);
            }
        }
    }

    public static void ordenar(String letra) {
        Collections.sort(funcionarios);

        for(String orderna : funcionarios) {
            if(orderna.startsWith(letra)){
                System.out.println(orderna);
                //System.out.println(funcionarios);
            }
        }
    }

    public static void contar(String letra) {
        int cont = 1;
        for(String contar : funcionarios){
            if(contar.startsWith(letra)) {
                System.out.println( cont + " - " + contar );
                cont++;
            }
        }
    }

    public static void main(String[] args) {
        funcionarios = new ArrayList<>();
        funcionarios.add("Antonio");
        funcionarios.add("Jose");
        funcionarios.add("Pedro");
        funcionarios.add("Joao");
        funcionarios.add("Andreia");
        funcionarios.add("Rafael");
        funcionarios.add("Robert");

        System.out.println("\n");
        contar("A");
        filtrar("R");
        ordenar("J");

    }
}
//https://docs.oracle.com/javase/1.5.0/docs/api/java/util/ArrayList.html
