package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios05_SequenciaS_Unidade04 {
    public static void main(String[] args){
        // S = {1, 4, 7, 10, 13, 16, 19, 22, 25}
        double s = 1, s9 = 0, s10 = 0, s100 = 0, s1000 = 0;

        for (int i = 2; i < 10000; i++ ) {
            s += + 3; // s = s + 3;

            if (i == 9) {
                s9 = s;
            } else if (i == 10) {
                s10 = s;
            } else if (i == 100) {
                s100 = s;
            } else {
                s1000 = s;
            }
        }
        JOptionPane.showMessageDialog(null,"Valores da sequência S:"
                +"\nS9 = " + s9
                +"\nS10 = " + s10
                +"\nS100 = " + s100
                +"\nS1000 = " + s1000);
    }
}
