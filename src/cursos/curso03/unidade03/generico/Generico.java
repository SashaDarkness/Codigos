package cursos.curso03.unidade03.generico;

import cursos.curso02.unidade03.Estacao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generico {
    public static void main(String[] args) {
        //----- SEM USO DO GENERICO -----
        List myIntList = new LinkedList();

        //myIntList.add(new Integer(0);

        Integer x = (Integer) myIntList.iterator().next();
        
        //O TYPE CAST (INTEGER) INTRODUZ A POSSIBILIDADE DE ERRO
        //EM TEMPO DE EXECUÇÃO.

        Estacao estacao = (Estacao) myIntList.iterator().next();

        //EXCEPTION IN THREAD "MAIN"
        //java.lang.ClassCastException: java.lang.Integer


        //----- COM USO DO GENERICO -----
        List<Integer> myIntLista = new ArrayList<Integer>();
        //myIntLista.add(new Integer(0));

        Integer xx = myIntLista.iterator().next();
        
    }
}
