package cursos.curso01.unidade03;

import javax.swing.JOptionPane;

public class Exercicios04_Avaliacao_Nota_Unidade03 {
    public static void main(String[] args) {
        Integer nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota:"));

        if (nota >= 90 && nota <= 100) {
            JOptionPane.showMessageDialog(null,"EXCELENTE");
        } else if (nota >= 70 && nota < 90) {
            JOptionPane.showMessageDialog(null,"BOM");
        } else if (nota >= 50 && nota <= 70) {
            JOptionPane.showMessageDialog(null,"REGULAR");
        } else if (nota > 0 && nota < 50){
            JOptionPane.showMessageDialog(null,"INSUFICIENTE");
        } else {
            JOptionPane.showMessageDialog(null,"Nota inválida.");
        }
    /*
        if (nota >= 0 && nota <= 100) {
            if (nota >= 90) {
                JOptionPane.showMessageDialog(null, "EXCELENTE");
            } else if (nota >= 70 ) {
               JOptionPane.showMessageDialog(null,"BOM");
            } else if (nota >= 50 ) {
               JOptionPane.showMessageDialog(null,"REGULAR");
            } else {
                JOptionPane.showMessageDialog(null, "INSUFICIENTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Essa nota é Inválida.");
        }
    */
    }
}
