package cursos.curso03.desafios.desafio_20_10_2022;

import java.util.*;

public class LojaVirtual {
    static List<String> clientes = new ArrayList<>();
    static List<String> receitas = new ArrayList<>();
    static List<String> valores = new ArrayList<>();
    boolean auferidas = true;

    int somaTotalValores = 0, i = 0;

    public  void filtrar(String letra) {
        //cria uma listagem com uma letra especifica inserida
        for(String filtrar : clientes){
            if(filtrar.startsWith(letra)){
                System.out.println(filtrar);
            }
        }
    }

    //listagem de clientes
    public void listarClientes(){ //método okay
        Collections.sort(clientes);
        // mostra todos os elementos
        for(String listagemClientes : clientes){
            System.out.println(listagemClientes);
            //System.out.println(clientes);
        }
    }

    //listagem de receitas auferidas
    public void listarReceitasAuferidas(String receita){
        Collections.sort(receitas);

        System.out.println("Receitas concluidas:");

        for(String listagemReceitas : receitas ){
            if (listagemReceitas.startsWith(receita) != auferidas){
                System.out.println(" - " + listagemReceitas);
            } else {
                System.out.println(" Not Concluding - " + listagemReceitas);
            }
        }

    }

    //listar clientes por ordem de valores
    public void listarClientesOrdemValor(int valor) {
        Collections.sort(valores);

        for (String ordemValor : valores) {
            if (ordemValor.startsWith(String.valueOf(valor))){// && letra.startsWith(letra)){
                System.out.println(ordemValor);
                System.out.println(valores);
            }
        }
    }

    public static void main(String[] args) {
        LojaVirtual lj = new LojaVirtual();

        clientes.add("sasha");
        clientes.add("samantha");
        clientes.add("samuel");

        System.out.println("\n-----Listar Clientes-----");
        lj.listarClientes();

        System.out.println("\n-----Filtrar Clientes-----\nletra: S\n");
        lj.filtrar("s");

        System.out.println("\n-----RECEITAS AUFERIDAS-----\n");
        receitas.add("receita 1");
        receitas.add("receita 2");

        lj.listarReceitasAuferidas(String.valueOf(receitas));

        System.out.println("\n-----VALORES-----\n");
        valores.add(String.valueOf(500));
        valores.add(String.valueOf(155));
        valores.add(String.valueOf(165));

        valores.add("30");
        valores.add("200");
        valores.add("150");
        valores.add("10");

        lj.listarClientesOrdemValor(20);



    }
}
