package cursos.curso02.unidade04.Pintor;

//Utilizar figura como uma interface aumenta o nível de polimorfimo.
public class Pintar {
    public static void main(String[] args) {
        Figura figura = new Circulo();
        Desenhista tc = new Desenhista(figura);

        tc.geraFigura();

        tc.figura = new Triangulo();

        tc.geraFigura();
    }

}
