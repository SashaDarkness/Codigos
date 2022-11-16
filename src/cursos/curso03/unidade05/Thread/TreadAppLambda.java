package cursos.curso03.unidade05.Thread;

import cursos.curso03.unidade05.Validacao.Runnable;

public class TreadAppLambda {
    public static void main(String[] args) {
        //criaçao de um lamda
        Runnable r = () ->
        {
           for (int i = 0; i <= 1000; i++) {
               System.out.println(i);
           }
        };
        //criando um thread passando como argumento um lambda
       new Thread(String.valueOf(r)).start();
    }

}
