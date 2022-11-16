package cursos.curso01.unidade03;

import javax.swing.JOptionPane;

public class Exercicios07_NotasSaque_Unidade03 {
    public static void main(String[] args) {
        int resto;
        double notas100, notas50, notas10;

        int saque = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do saque"));

        //SE O SAQUE É MÚLTIPLO DE 10 PEGAR O RESTO E VERIFICAR SE É IGUAL A ZERO
        String result = "";
        if (saque % 10 == 0) {
            notas100 = Math.floor(saque / 100);
            resto = saque % 100;
            notas50 = Math.floor(resto / 50);
            resto = resto % 50;
            notas10 = Math.floor(resto / 10);

            if (notas100 > 0)
                result += Math.round(notas100) + " notas de cem.\n";
            if (notas50 > 0)
                result += Math.round(notas50) + " notas de cinquenta.\n";
            if (notas10 > 0)
                result += Math.round(notas10) + " notas de dez.\n";
        } else {
            JOptionPane.showMessageDialog(null, "Valor informado do saque está incorreto");
        }
        JOptionPane.showMessageDialog(null, "Notas que seram recebidas:\n\n" + result );
    }
}
