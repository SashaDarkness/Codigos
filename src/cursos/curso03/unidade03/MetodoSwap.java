package cursos.curso03.unidade03;
import java.util.ArrayList;
import java.util.List;

public class MetodoSwap {
    public static <T> List<T> swap (int indiceOrigem, int indiceDestino,List<T>colecao){
        T aux = colecao.get(indiceOrigem);

        colecao.set(indiceOrigem,colecao.get(indiceDestino));
        colecao.set(indiceDestino, aux);

        return colecao;
    }

    public static void main(String[] args) {
        List <String> teste = new ArrayList<>();

        teste.add("Sasha");
        teste.add("Caroline");

        teste = swap(0, 1, teste);

        teste.forEach(System.out::println);
    }
}
