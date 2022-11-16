package cursos.curso03.unidade04.Interfaces_Map;

import java.util.HashMap;

public class HashMapApp {
    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();

        //mantem a ordem dos elementos inseridos
        //Dois valores iguais o último com o mesmo indice prevalece
        list.put(1, "Bruno");
        list.put(2, "Umberto");
        list.put(3, "Fernando");
        list.put(4, "Caetano");
        list.put(5, "Umberto");

        System.out.println(list);

    }
}
