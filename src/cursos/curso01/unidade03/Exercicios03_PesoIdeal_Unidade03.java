package cursos.curso01.unidade03;

import javax.swing.*;

public class Exercicios03_PesoIdeal_Unidade03 {
    public static void main (String[] args){
        Double altura, peso_Homem, peso_Mulher;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
        String sexo = JOptionPane.showInputDialog("Informe o sexo (H - Homem ou M - Mulher): ");

        if (sexo.equalsIgnoreCase("M")) {
            peso_Mulher = (altura * 72.7) - 58;
            JOptionPane.showMessageDialog(null,"Peso ideal é: " + peso_Mulher );
        } else {
            peso_Homem = (altura * 62.1) - 44.7;
            JOptionPane.showMessageDialog(null,"Peso ideal é: " + peso_Homem );
        }
    }
}
