package cursos.curso02.unidade02;

public class exerc09_VetorListaLength_unidade02 {
    public static void main(String[] args) {
        int lista[] = new int[5];

        for (int i = 0; i < lista.length; i++){
            System.out.print(lista[i] + " ");
        }

        for (int listas : lista){
            System.out.print(listas);
        }
    }
}
