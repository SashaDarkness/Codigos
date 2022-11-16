package cursos.curso01.desafio_29_09_2022.Desafio03;
public class questao01AlfabetoCifrado1 {
    public static void main(String[] args){
        for (int i = 97; i < 123; i++) {
            if (i <= 123){ //A = 97 e Z = 122;  A = B, B = C, C = D...
                System.out.println( i + " " + (char) i + " => " + (char) (i + 1) + " " + (i + 1));
            }
        }
    }
}
