package cursos.curso03.unidade04.LojaVirtual;

import java.nio.file.Path;

public class Cursos {

    int cdcurso;
    String nome;
    float valor;
    Path url;

    public Cursos(int cdcurso, String nome, float valor, Path url) {
        super();
        this.cdcurso = cdcurso;
        this.nome = nome;
        this.valor = valor;
        this.url = url;
    }

    @Override
    public String toString(){
        return "Curso: " + nome;
    }


}
