package cursos.curso03.unidade03.persistencia;

import cursos.curso03.unidade01.abc.treinamentos.rh.Administrativo;
import cursos.curso03.unidade01.abc.treinamentos.rh.Diretor;

public class PersistenciaApp {
    public static void main(String[] args) {
        GenericDAO<Administrativo> admin = new GenericDAO<>();
        admin.create(new Administrativo());

        GenericDAO<Diretor> diretor = new GenericDAO<>();
        diretor.create(new Diretor());

    }
}
