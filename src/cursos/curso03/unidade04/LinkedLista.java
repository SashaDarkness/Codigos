package cursos.curso03.unidade04;

import java.util.LinkedList;

public class LinkedLista {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Vermelho");
        lista.add("Verde");
        lista.add("Verde");
        lista.add("Amarelo");
        lista.add("Preto");
        lista.add("Azul");

        lista.removeFirst();
        lista.removeLast();

        System.out.println(lista);

    }
}
