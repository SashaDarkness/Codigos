package cursos.curso03.unidade03.generico;

import cursos.curso03.unidade03.generico.Login;

public class UsoGenerics2 {
    public static void main(String[] args) {
        Login<String,String> iob = new Login<>("Sasha","12345");

        iob.showType();
    }
}
