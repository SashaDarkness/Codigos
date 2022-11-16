package cursos.curso02.unidade02;

import javax.swing.*;

public class exerc04_AvaliacaoNotaVERSAO02_unidade02 {
    public static void main(String[] args) {

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe uma nota de 0 a 100:"));

        if (nota < 0 || nota > 100) {
            JOptionPane.showMessageDialog(null, "NOTA INVÁLIDA, INSIRA NOVAMENTE.");
            main(null);
        } else {
            if (nota < 50) {
                JOptionPane.showMessageDialog(null, "INSUFICIENTE");
            } else if (nota < 70) {
                JOptionPane.showMessageDialog(null, "REGULAR");
            } else if (nota < 90) {
                JOptionPane.showMessageDialog(null, "BOM");
            } else {
                JOptionPane.showMessageDialog(null, "EXCELENTE");
            }
        }
    }
}

