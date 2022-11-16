package cursos.curso03.unidade04.Interfaces_Set;

import java.util.Set;
import  java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        Set<String> treeList = new TreeSet<>();
        //TreeSet<String> treeList = new TreeSet<>();

        //ordena os elementos de forma crescente e não repete valores iguais
        treeList.add("vermelho");
        treeList.add("verde");
        treeList.add("verde");
        treeList.add("amarelo");
        treeList.add("preto");
        treeList.add("azul");

        System.out.println(treeList);

    }
}
