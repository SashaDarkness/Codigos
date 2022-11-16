package cursos.curso01.unidade04;
import javax.swing.JOptionPane;

public class Exercicios18_NumeroEstrelas_Unidade04 {
    public static void main(String[] args){
        String estrela = "*";

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de linhas:"));

        String acumulador = "";
        for(int i = 1 ; i <= numero ; i++) {
            acumulador += estrela + "\n";
            JOptionPane.showMessageDialog(null, acumulador);
            //System.out.println(estrela);
            estrela = estrela + "*";
        }
    }
}
