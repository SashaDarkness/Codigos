package cursos.curso03.unidade04.Interfaces_Set;

import java.util.HashSet;

public class HashSetApp {
    public static void main(String[] args){
        HashSet<String> listaHash =  new HashSet<>();

        //não ordena os elementos e não repete valores iguais
        listaHash.add("vermelho");
        listaHash.add("verde");
        listaHash.add("verde");
        listaHash.add("amarelo");
        listaHash.add("preto");
        listaHash.add("azul");

        System.out.println(listaHash);
    }
}
