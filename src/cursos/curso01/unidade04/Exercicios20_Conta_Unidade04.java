package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios20_Conta_Unidade04 {
    public static void main(String[] args){
        int numero_contas = 0;
        double valor_total = 0;

        String descricao_conta = JOptionPane.showInputDialog("Informe o  Conta:");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um Valor:"));

        while (valor > 0 ) {
            JOptionPane.showMessageDialog(null, "A Conta " + descricao_conta
                    + " tem o valor de R$ " + valor + " reais.");
            numero_contas++;
            valor_total = valor_total + valor;

            descricao_conta = JOptionPane.showInputDialog("Informe a Conta:");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor:"));
        }
            JOptionPane.showMessageDialog(null, "O número de contas = " + numero_contas
                    + " tem o valor total de R$" + valor_total + " reais.");
    }
}