package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios19_NumerosPares_Unidade04 {
    public static void main(String[] args){

        int valoA = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o A: "));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o B: "));

        for(int i = valoA ; i <= valorB ; i++) {
            if (i % 2 == 0) {
                JOptionPane.showMessageDialog(null,"NÚMERO " + i + " É PAR");
            } else {
                JOptionPane.showMessageDialog(null,"NÚMERO " + i + " É IMPAR");
            }
        }
    }
}
