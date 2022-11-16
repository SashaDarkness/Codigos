package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.JOptionPane;

public class Exerc03_Numero_Anterior_Posterior_Unidade02 {
    public static void main(String[] args){

        Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        JOptionPane.showMessageDialog(null,"Número : " + numero +
                "\nAnterior: " + (numero - 1) + "\nPosterior: " + (numero + 1) );

    }
}
