package cursos.curso01.desafio_29_09_2022.Desafio01;
public class questao01_SequenciaS1 {
    public static void main(String[] args){
        int s = 1, contador = 0;

        System.out.println("-Sequencia:s = 1, 2, 4, 7, 11, ...");
        for (int i = 0; i < 20; i++ ) {
            s = s + contador;
            contador++;
            System.out.print( s + ". ");
        }
    }
}
