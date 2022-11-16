package cursos.curso03.unidade05.Default;

import static java.lang.System.out;

public interface Bar {
    default void talk() {
        out.println("Bar!");
    }
}
