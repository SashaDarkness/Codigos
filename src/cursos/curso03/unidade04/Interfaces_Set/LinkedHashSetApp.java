package cursos.curso03.unidade04.Interfaces_Set;

import java.util.LinkedHashSet;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        LinkedHashSet<String> linkList = new LinkedHashSet<>();

        //ordena os elementos por inserção e não repete valores iguais
        linkList.add("vermelho");
        linkList.add("verde");
        linkList.add("verde");
        linkList.add("amarelo");
        linkList.add("preto");
        linkList.add("azul");

        System.out.println(linkList);

    }
}
