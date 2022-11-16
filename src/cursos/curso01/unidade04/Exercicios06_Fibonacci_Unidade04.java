package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios06_Fibonacci_Unidade04 {
    public static void main(String[] args){
    /*  F (1) = 1,
        F (2) = 1,
        F (3) = F (n-1) + F(n-2), para n >= 3
    */
        double s = 0, s1 = 1, s2 = 1, s9 = 0, s10 = 0, s100 = 0, s10000 = 0;

        for (int i = 2; i < 10000; i++ ) {
            s = s1 + s2; // s = s + 3;
            s1 = s2;
            s2 = s;

            if (i == 9){
                s9 = s;
            } else if (i == 10) {
                s10 = s;
            } else if (i == 100) {
                s100 = s;
            } else if (i == 1000) {
                s10000 = s;
            }
        }
        JOptionPane.showMessageDialog(null,"Valores da sequência Fibonacci:"
                +"\nS9 = " + s9
                +"\nS10 = " + s10
                +"\nS100 = " + s100
                +"\nS10000 = " + s10000);
    }
}
