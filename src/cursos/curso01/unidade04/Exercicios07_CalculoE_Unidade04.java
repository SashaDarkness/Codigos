package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios07_CalculoE_Unidade04 {
    public static void main(String[] args){
        double x, e = 0;

        x = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para X :"));

        for (int i = 1; i < 50; i++){
            e = e + Math.pow(x, i) / i;
        }
        JOptionPane.showMessageDialog(null,"O valor de E^" + x + " = " + e );
    }
}
