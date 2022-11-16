package cursos.curso01.desafios_feitos_na_aula;

public class desafio03 {
    public static void main(String[] args){
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal = System.currentTimeMillis();

        System.out.println(desafio03.fibo(100));
        System.out.println(tempoFinal - tempoInicial);
   }

    public static int fibo (int numero) {
        return(
               switch (numero) {
                   case 1, 2 -> 1;
                   default -> {
                       int fibonacci = fibo(numero - 1 ) + (numero - 2);
                       yield fibonacci;
                   }
               }
        );
    }


}
