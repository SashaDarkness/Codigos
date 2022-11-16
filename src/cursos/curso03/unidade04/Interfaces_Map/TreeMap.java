package cursos.curso03.unidade04.Interfaces_Map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<Integer, String> list = new java.util.TreeMap<>();

        list.put(1, "Bruno");
        list.put(2, "Umberto");
        list.put(3, "Fernando");
        list.put(4, "Caetano");
        list.put(5, "Umberto");

        System.out.println(list);

    }

}

