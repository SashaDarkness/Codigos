package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios16_NumeroPrimo_Unidade04 {
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        int numero_divisores = 0;

        for(int i =1; i <= numero; i++) {
            if (numero %i == 0)
                numero_divisores++;
        }
            if (numero_divisores == 2) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é Primo.");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " não é Primo.");
            }
    }

}
