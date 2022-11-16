package cursos.curso03.unidade01;

import java.io.IOException;

public class TesteLeitura {
    public static void main(String[] args) {
        byte[] bytes = new byte[10];

        System.out.println("Digite algo: ");

        try {
            System.in.read(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nEco: " + new String(bytes));


    }
}
