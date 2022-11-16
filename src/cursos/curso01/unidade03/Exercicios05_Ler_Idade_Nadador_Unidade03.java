package cursos.curso01.unidade03;
import javax.swing.JOptionPane;

public class Exercicios05_Ler_Idade_Nadador_Unidade03 {
    public static void main(String[] args) {

        Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do nadador:"));

        if (idade >= 0 && idade <= 100) {
            if (idade >= 18) {
                JOptionPane.showMessageDialog(null, "ADULTO");
            } else if (idade >= 14) {
                JOptionPane.showMessageDialog(null, "JUVENIL B");
            } else if (idade == 12 && idade == 13) {
                JOptionPane.showMessageDialog(null, "JUVENIL A");
            } else if (idade >= 9) {
                JOptionPane.showMessageDialog(null, "INFANTIL C");
            } else if (idade >= 6) {
                JOptionPane.showMessageDialog(null, "INFANTIL B");
            } else {
                JOptionPane.showMessageDialog(null, "INFANTIL A");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Idade inválida!");
            Exercicios05_Ler_Idade_Nadador_Unidade03.main(null);
        }
    }
}
