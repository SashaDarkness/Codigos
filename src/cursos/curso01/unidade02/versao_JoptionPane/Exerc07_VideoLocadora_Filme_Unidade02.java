package cursos.curso01.unidade02.versao_JoptionPane;
import javax.swing.JOptionPane;

public class Exerc07_VideoLocadora_Filme_Unidade02 {
    public static void main(String[] args) {

        String filme = JOptionPane.showInputDialog("Informe o título do filme:");
        Integer horas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de horas do filme:"));
        Integer minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de minutos do filme:"));

        int calcular = horas * 60 + minutos;
        JOptionPane.showMessageDialog(null,"Título do filme: " + filme
               + "\nDuração em minutos: " + calcular);
    }
}
