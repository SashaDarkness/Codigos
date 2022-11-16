package cursos.curso03.unidade01;

public class Teste {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int i = 0 ;
        String[] frases = {"um","dois","tres"};

        while (i<4){
            System.out.println(frases[i]);
            i++;
        }

    /*
        while (i<4){
            try{
                System.out.println(frases[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("erro ao acesso do vetor " + e.getMessage());
            }
            i++;
        }
    */

    }
}
