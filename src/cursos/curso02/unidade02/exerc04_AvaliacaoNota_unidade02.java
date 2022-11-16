package cursos.curso02.unidade02;

import javax.swing.*;

public class exerc04_AvaliacaoNota_unidade02 {
    public static void main(String[] args) {

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe uma nota de 0 a 100:"));

        if (nota >= 0 && nota <= 100) {
            if (nota >= 90) {
                JOptionPane.showMessageDialog(null, "EXCELENTE");
            } else if (nota >= 70) {
                JOptionPane.showMessageDialog(null, "BOM");
            } else if (nota >= 50) {
                JOptionPane.showMessageDialog(null, "REGULAR");
            } else {
                JOptionPane.showMessageDialog(null, "INSUFICIENTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "NOTA INVÁLIDA, INSIRA NOVAMENTE.");
            main(null);
        }
    }
}

