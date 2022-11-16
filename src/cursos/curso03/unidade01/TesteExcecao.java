package cursos.curso03.unidade01;

public class TesteExcecao {
    public static void main(String[] args) {
        try {
            int i = 50;
            // i = i / 0;

            Object c = null;

            System.out.println("O resultado: " + i);
            System.out.println("O resultado: " + c.toString() );

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch ( NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
