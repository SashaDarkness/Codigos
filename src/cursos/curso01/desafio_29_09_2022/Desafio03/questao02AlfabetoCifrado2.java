package cursos.curso01.desafio_29_09_2022.Desafio03;
//A = B, B = D, C = F, D = H...
public class questao02AlfabetoCifrado2 {
    public static void main(String[] args){
        int cont = 1;
        for (char i = 97; i < 123; i++ ) {
            if (i + cont <= 123 ) {
                System.out.println( i + " => " + (char) (i + cont ) );
            } else {
                cont = cont - 27;
                System.out.println( i + " => " + (char) (i + cont ) );
            }
            cont++;
        }
    }
}
