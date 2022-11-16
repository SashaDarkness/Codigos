package cursos.curso01.unidade05;

import javax.swing.JOptionPane;

public class Exercicios02_Calcular_Vetor_Unidade05 {
    public static void main(String[] args) throws Exception  {

        double[] valor_A = new double[10];
        double[] valor_B = new double[10];

        for (int i = 0; i < 10; i ++){
            valor_A[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " +i+ " valor de A:"));

            if(i % 2 == 0) {
                valor_B[i] = 2 * valor_A[i];
            } else {
                valor_B[i] = valor_A[i] / 2;
            }
        }

        for (double valor: valor_A){
            JOptionPane.showMessageDialog(null,"Valor A = " + valor);
        }
        for (double valor: valor_B){
            JOptionPane.showMessageDialog(null,"Valor B = " + valor);
        }

    }
}
