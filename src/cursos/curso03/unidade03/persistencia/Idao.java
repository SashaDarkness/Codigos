package cursos.curso03.unidade03.persistencia;

public interface Idao <T> {
    public void create(T entidade);

    public void insert (T entidade);

    public void update (T entidade);

    public void delete(T entidade);
}
