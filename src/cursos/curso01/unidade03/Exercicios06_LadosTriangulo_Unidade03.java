package cursos.curso01.unidade03;

import javax.swing.JOptionPane;

public class Exercicios06_LadosTriangulo_Unidade03 {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A do triângulo"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B do triângulo"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de C do triângulo"));

        if ( (a < b + c) && (b < a + c) && (c < a + b) ) {
            if (a == b && b == c) {
                JOptionPane.showMessageDialog(null,"TRIANGULO EQUILÁTERO.");
            } else if (a == b || b == c) {
                JOptionPane.showMessageDialog(null,"TRIANGULO ISÓSCELES.");
            } else {
                JOptionPane.showMessageDialog(null,"TRIANGULO ESCALENO.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"OS LADOS INFORMADOS NÃO FORMAM UM TRIANGULO.");
            Exercicios06_LadosTriangulo_Unidade03.main(null);
        }
    }
}
