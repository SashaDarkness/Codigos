package cursos.curso02.unidade02;

import javax.swing.*;

public class exerc03_MaiorOUMenorValor_unidade02 {
    public static void main(String[] args) {
        int numero1, numero2, maior = 0, menor = 0;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));

        if (numero1 > numero2) {
            maior = numero1;
            menor = numero2;
        } else if (numero2 > numero1) {
            maior = numero2;
            menor = numero1;
        } else {
            JOptionPane.showInputDialog(null, "Números possuem o mesmo valor.");
        }
        JOptionPane.showMessageDialog(null,"Menor número é: " + menor);
        JOptionPane.showMessageDialog(null,"Maior número é: " + maior);

    }
}