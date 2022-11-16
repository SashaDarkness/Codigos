package cursos.curso02.unidade04.Pintor;

public class Desenhista {
    public Figura figura;
    public Desenhista(Figura figura) {
	this.figura = figura;
    }
    public void geraFigura() {
	this.figura.desenha();
    }
}
