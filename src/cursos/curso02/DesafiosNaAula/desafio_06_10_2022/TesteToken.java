package cursos.curso02.DesafiosNaAula.desafio_06_10_2022;

public class TesteToken {
    public static void main(String[] args){
        String dataHoje = "06/10/2022";

        for (String tokens : dataHoje.split("/")){
            System.out.print(tokens + " ");
        }
    }
}
