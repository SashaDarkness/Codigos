package cursos.curso01.unidade03;

import javax.swing.JOptionPane;

public class Exercicios01_EquacaoSegundoGrau_Unidade03 {

    public static void main(String[] args){
        double delta, x1, x2;
        // a = 3, b = -1, c = -2;  x1 = 1, x2 = -2/3
        Integer a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do \"a\" :"));

        if (a > 0) {
            Integer b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do \"b\" :"));
            Integer c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do \"c\" :"));

            delta = Math.pow(b, 2) - 4 * (a * c); //ou delta = (b * b) - 4 * a * c;
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            JOptionPane.showMessageDialog(null,"Valor do delta: " + delta
                + "\nValor do X1 : " + x1
                + "\nValor do X2 : " + x2 );
        } else {
            JOptionPane.showMessageDialog(null,"Não é uma equação do segundo grau.");
        }

    }
}
