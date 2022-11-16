package cursos.curso03.unidade02;

import javax.swing.*;
import java.awt.*;

public class AvaliacaoApplet extends JApplet {

    private static final long serialVersionUID = 1L;

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        String notas = JOptionPane.showInputDialog("Informe a nota:");
        Double nota = Double.parseDouble(notas);

        if (nota < 0 || nota > 100) {
            JOptionPane.showMessageDialog(null, "Nota inválida, insira de 0 a 100.");
            paint(null); //retorna para ser inserido o valor novamente
        } else {
            if (nota >= 90) {
                JOptionPane.showMessageDialog(null, "EXCELENTE");
            } else if (nota >= 70 ) {
                JOptionPane.showMessageDialog(null,"BOM");
            } else if (nota >= 50 ) {
                JOptionPane.showMessageDialog(null,"REGULAR");
            } else {
                JOptionPane.showMessageDialog(null, "INSUFICIENTE");
            }
            System.exit(0);
        }
    }
}
