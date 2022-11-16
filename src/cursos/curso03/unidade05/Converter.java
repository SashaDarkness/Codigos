package cursos.curso03.unidade05;

@FunctionalInterface
public interface Converter<F, T> {
    T convert (F lugar);
}


