package cursos.curso03.unidade05.Thread;

import cursos.curso03.unidade05.Validacao.Runnable;

public class TreadApp {
    public static void main(String[] args) {
        Runnable r = new Runnable() {

        //objeto do tipo anonimo que implementa a interface Runnable
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(String.valueOf(r)).start();
        //  new Thread(r).start();
    }
}
