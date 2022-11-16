package cursos.curso03.unidade04;

import java.util.ArrayList;
public class Notebook {
    static ArrayList<String> anotacoes;
    public static void main(String[] args) {

        anotacoes = new ArrayList<>();

        anotacoes.add("Comprar pão");
        anotacoes.add("Vender Carro");
        anotacoes.add("Encontro as 11h");

        double t1 = System.currentTimeMillis();

        for(int i = 3; i < 10003; i++){
            anotacoes.add("texto_" + i);
        }

        double t2 = System.currentTimeMillis();
        System.out.println((t1 - t2) / 1000);

        //System.out.println(anotacoes);

    }
}
