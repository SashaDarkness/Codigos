package cursos.curso01.unidade03;
import javax.swing.JOptionPane;
public class Exercicios00_NumeroPar_Valores_Unidade03 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para saber se é PAR ou IMPAR:"));

        if (numero %2 == 0)
           JOptionPane.showMessageDialog(null,"Número é PAR");
        else
            JOptionPane.showMessageDialog(null,"Número é IMPAR");
    }
}
