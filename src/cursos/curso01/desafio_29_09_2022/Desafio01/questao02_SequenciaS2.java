package cursos.curso01.desafio_29_09_2022.Desafio01;
public class questao02_SequenciaS2 {
    public static void main(String[] args){
        int s = 2, contador = 1;
        System.out.println("Sequencia:\nS = 2, 3, 6, 11, 18, ...");
        System.out.print("S = " + s + ". ");
        for (int i = 0; i < 20; i++ ) {
            s = s + contador;
            contador += 2;
            System.out.print( s + ". ");
        }
    }
}


