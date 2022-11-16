package cursos.curso01.unidade03;

import javax.swing.JOptionPane;

public class Exercicios08_de_Java_Unidade03 {
    public static void main(String[] args) {
        double valor_Convertido = 0;

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para converter:"));
        int tipo_Moeda = Integer.parseInt(JOptionPane.showInputDialog("Para qual tipo de moeda deseja converter? :"
                + "\n1 - Libra"
                + "\n2 - Dólar"
                + "\n3 - Euro"));

        switch (tipo_Moeda) {
            case 1: {
                valor_Convertido = valor / 5;
                JOptionPane.showMessageDialog(null, "O valor convertido para Libras: " + valor_Convertido);
                break;
            }
            case 2:
                valor_Convertido = valor / 4;
                JOptionPane.showMessageDialog(null, "O valor convertido para Dolar: " + valor_Convertido);
                 break;

            case 3:
                valor_Convertido = valor / 4;
                JOptionPane.showMessageDialog(null, "O valor convertido para Euro: " + valor_Convertido);
                break;

            default:
                JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA.");
                Exercicios08_de_Java_Unidade03.main(null);
        }
    }
}
