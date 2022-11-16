package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios01_Tabuada_Unidade04 {
    public static void main(String[] args){
        int numero, total = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        String tabuada = "";
        for (int i = 0; i < 11; i ++){
            total = numero * i;
            tabuada += "Número:" + numero + "x" + i + " = " + total + "\n";
        }
        JOptionPane.showMessageDialog(null, "Tabuada do número: "
                + numero + "\n" + tabuada);

    }
}
