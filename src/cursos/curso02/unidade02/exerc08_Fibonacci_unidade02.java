package cursos.curso02.unidade02;

public class exerc08_Fibonacci_unidade02 {
    public static void main(String[] args) {
        int s = 0, s1 = 1, s2 = 1;

        System.out.print(s1 + "," + s2 + ",");
        for (int i = 3; i <= 20; i++ ) {
            s = s1 + s2; // s = s + 3;
            s1 = s2;
            s2 = s;
            System.out.print(s + ",");
        }
    }
// FÓRMULA: F (1) = 1, F (2) = 1,
// F (3) = F (n-1) + F(n-2), para n >= 3
}
