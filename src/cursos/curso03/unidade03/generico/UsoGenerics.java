package cursos.curso03.unidade03.generico;

public class UsoGenerics {
    public static void main(String[] args) {
        ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
        iob.showType();

        ExemploGenerics<String> sob = new ExemploGenerics<>("Sasha");
        sob.showType();
    }
}
