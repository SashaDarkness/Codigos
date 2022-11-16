package cursos.curso03.unidade04;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> lista = new ArrayDeque<>(); //ArrayDeque<String> lista = new ArrayDeque<>();

        lista.add("Vermelho");
        lista.add("Verde");
        lista.add("Verde");
        lista.add("Amarelo");

        lista.addFirst("Azul");
        lista.addLast("Preto");

        System.out.println(lista);

        lista.removeFirst();
        lista.removeLast();

        System.out.println(lista);
        System.out.println("\n-----");
        System.out.println(lista.peekFirst());
        System.out.println(lista.peekLast());

    }
}
