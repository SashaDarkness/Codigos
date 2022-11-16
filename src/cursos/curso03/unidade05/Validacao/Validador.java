package cursos.curso03.unidade05.Validacao;

@FunctionalInterface
public interface Validador<T> {
    boolean valida(T t);
    //boolean metodo(T t); //não aceita dois métodos como sendo abstrata

}
