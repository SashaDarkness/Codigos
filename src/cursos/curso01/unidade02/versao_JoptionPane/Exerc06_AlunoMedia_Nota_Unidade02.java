package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.JOptionPane;

public class Exerc06_AlunoMedia_Nota_Unidade02 {
    public static void main(String[] args) {
        double nota01, nota02, nota03, nota04;

        nota01 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª nota:"));
        nota02 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª nota:"));
        nota03 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3ª nota:"));
        nota04 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4ª nota:"));
        Integer frequencia = Integer.parseInt(JOptionPane.showInputDialog("Informe a frequencia do aluno:"));

        double media = (nota01 + nota02 + nota03 + nota04) / 4;
        JOptionPane.showMessageDialog(null,"Média das notas: " + media );

        if (frequencia >= 75 && media > 5)  {
            JOptionPane.showMessageDialog(null, "Aluno aprovado.");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno reprovado.");
        }
    }
}
