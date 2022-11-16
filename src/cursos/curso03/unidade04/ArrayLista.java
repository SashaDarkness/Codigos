package cursos.curso03.unidade04;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Vermelho");
        lista.add("Verde");
        lista.add("Verde");
        lista.add("Amarelo");
        lista.add("Preto");
        lista.add("Azul");

        Collections.sort(lista);

        System.out.println(lista);

    }
}
