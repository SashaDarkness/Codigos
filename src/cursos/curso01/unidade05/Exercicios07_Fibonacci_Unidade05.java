package cursos.curso01.unidade05;

import javax.swing.JOptionPane;

public class Exercicios07_Fibonacci_Unidade05 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        Fibonacci(numero);
    }

    public static void Fibonacci(int numero) {
        int s = 0, s1 = 1, s2 = 1;

        //JOptionPane.showMessageDialog(null, s1 + "," + s2 + ",");
        System.out.println(s1 + "," + s2 + ",");

        for (int i = 3; i <= numero; i++ ) {
            s = s1 + s2; // s = s + 3;
            s1 = s2;
            s2 = s;
            //JOptionPane.showMessageDialog(null,s + ",");
            System.out.println(s + ",");
        }
    }
    /* FÓRMULA:
        F (1) = 1,
        F (2) = 1,
        F (3) = F (n-1) + F(n-2), para n >= 3
    */
}
