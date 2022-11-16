package cursos.curso03.unidade05.com.abc.treinamentos;

import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;

public class LojaVirtual2 {
    static Map<Cliente, List<Cursos>> pagamentos = new HashMap<>();

    public static void listarCursos(List<Cursos> lista){
        //lista.forEach( p -> System.out.println(p.getCdcurso() + " <==> " + p.getNome()));
        lista.forEach(System.out::println);
    }

    public static void main(String[] args) {

        //criar cursos disponiveis no site para venda
        Cursos java8 = new Cursos(1, "Java 8 para Web", 2000, Paths.get("/java8"));
        Cursos oracle12c = new Cursos(2, "Oracle 12C", 2500, Paths.get("/oracle12c"));
        Cursos php7 = new Cursos(3, "php 7", 1500, Paths.get("/php7"));

        //cadastrar um cliente
        Cliente sasha = new Cliente("sasha","123.456.789-00", "sasha@gmail.com");

        //criar a lista de cursos do cliente
        List<Cursos> cursoEscolhido = new LinkedList<>();

        //fazer um checkout dos cursos escolhidos
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4 ){
            System.out.println("Qual curso deseja adquirir:");
            System.out.println("1 -  Java 8 \n2 - Oracle 12C \n3 - PHP 7 \n4 - Finalizar");
            opcao = input.nextInt();

            if(opcao == 1){
                cursoEscolhido.add(java8);
            } else if (opcao == 2) {
                cursoEscolhido.add(oracle12c);
            }  else if (opcao == 3) {
                cursoEscolhido.add(php7);
            } else {
                opcao = 4;
            }
        }

        input.close();
        pagamentos.put(sasha,cursoEscolhido); // -> Map<Cliente, List<Cursos>> pagamentos
        System.out.println(pagamentos);
        //listarCursos(cursoEscolhido);

        //referencia de métodos
        Consumer<List<Cursos>> consumer = LojaVirtual2::listarCursos;
        consumer.accept(cursoEscolhido);
    }
}
